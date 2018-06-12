import java.util.*;

/**
 * Created by Mehari on 6/11/18.
 */
public class ShortestPathFromPoliceStation {

    public static class Vertex{
        String label;
        Vertex parent;
        Vertex[] edges;
        Integer[] edgeDistance;
        Integer distanceFromSource;
        public Vertex(String label){
            this.label=label;
            this.distanceFromSource=Integer.MAX_VALUE;
        }

        public void setEdges(Vertex[]edges, Integer[]edgeDistance){
            this.edges=edges;
            this.edgeDistance=edgeDistance;
        }
    }



    public List<Vertex> dijkstra(List<Vertex> graph, Vertex start){

        PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>(new Comparator<Vertex>() {
            public int compare(Vertex o1, Vertex o2) {
                return Integer.compare(o1.distanceFromSource, o2.distanceFromSource);
            }
        });

        //add all vertices to the priority queue
        start.distanceFromSource =0;
        for(Vertex v: graph){
            queue.add(v);
        }

        while(!queue.isEmpty()){
            Vertex v = queue.remove();
            for(int i=0; i<v.edges.length; i++){
                Vertex edge = v.edges[i];
                Integer edgeDist = v.edgeDistance[i];
                int newDistance = edgeDist + v.distanceFromSource;
                if(edge.distanceFromSource > newDistance){
                    edge.parent=v;
                    edge.distanceFromSource = newDistance;
                }
            }

        }
        return graph;

    }

    public static void main(String[] args){
        /**
         Graph with unit distance: {1: [2,6], 2: {6,3,1}, 3: {2,4,6,5}, 4: {3,5}, 5: {3,6}, 6: {1,2,3}}
         police stations: 1,5
         output - distance from source: 1:0, 2:1, 3:1, 4:1, 5:0, 6:1
         * */

        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");
        Vertex v6 = new Vertex("6");

        v1.setEdges(new Vertex[]{v2,v6},new Integer[]{1,1});
        v2.setEdges(new Vertex[]{v6,v3,v1},new Integer[]{1,1,1});
        v3.setEdges(new Vertex[]{v2,v4,v6,v5},new Integer[]{1,1,1,1});
        v4.setEdges(new Vertex[]{v3,v5},new Integer[]{1,1});
        v5.setEdges(new Vertex[]{v3,v6,v4}, new Integer[]{1,1,1});
        v6.setEdges(new Vertex[]{v1,v2,v3}, new Integer[]{1,2,3});

        List<Vertex> graph = Arrays.asList(v1, v2, v3, v4, v5, v6);
        ShortestPathFromPoliceStation shortestPath = new ShortestPathFromPoliceStation();
        List<Vertex> distanceFromStation5 = shortestPath.dijkstra(graph, v5);

        System.out.println("distance from station 5");
        for(Vertex v: distanceFromStation5){
            System.out.println(v.label + ": "+ v.distanceFromSource);
        }

        System.out.println("distance from both Station 5 and 1");
        List<Vertex> shortestDistance = shortestPath.dijkstra(distanceFromStation5, v1);
        for(Vertex v: shortestDistance){
            System.out.println(v.label + ":" + v.distanceFromSource);
        }

    }

}
