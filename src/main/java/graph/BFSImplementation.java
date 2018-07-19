package graph;

import java.util.*;

/**
 * Created by Mehari on 7/18/18.
 */
public class BFSImplementation {

    public static void bfs(HashMap<Integer, List<Integer>> graph, int startVertex){
        Queue<Integer> q = new LinkedList<Integer>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(startVertex);
        while (!q.isEmpty()){
            int vertex = q.remove();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                System.out.println(vertex);
                for (int edge : graph.get(vertex)) {
                    q.add(edge);
                }
            }

        }
    }



    public static void main(String[] args){
        // given the graph
        /*

           +-----+ 1  -------+
           |       |         |
           |       |         |
           v       |         v
           2       v         3+---+
           +-----> 4              |
                                  v
                                  5


        * */
        //starting from node 1 the expected out put of a bfs is
        //1,2,4,3,5

        HashMap<Integer, List<Integer>> graph = new HashMap<Integer, List<Integer>>();
        graph.put(1, Arrays.asList(2,4,3));
        graph.put(2, Arrays.asList(4));
        graph.put(3, Arrays.asList(5));
        graph.put(4, Arrays.asList());
        graph.put(5, Arrays.asList());

        bfs(graph,1);

    }



}
