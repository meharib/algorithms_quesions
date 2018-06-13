import java.util.*;

/**
 * Created by Mehari on 6/12/18.
 */
public class GraphValidPath {
    public String solve(int A, int B, int C, int D, ArrayList<Integer> E, ArrayList<Integer> F) {
        //encode vertexes without circles
        //B is Y coordinate
        //A is x cordiante
        List<Integer> vertices = new ArrayList<Integer>();
        List<Integer> excludes = excludeVertex_(A,B,E,F,D,A);
        Map<Integer, List<Integer>> adjList= new HashMap<Integer, List<Integer>>();

        int start=0;
        int end = encode(A,B,A);
        if(excludes.contains(start) || excludes.contains(end)){
            return "NO";
        }


        for(int i=0; i<=B; i++){
            for(int j=0; j<=A; j++){
                int v= encode(j,i,A);
                if(!excludes.contains(v)){
                    vertices.add(v);
                    addEdges(adjList,v,j,i,A,B,excludes);
                }
            }
        }

        if(bfs(adjList,start,end)){
            return "YES";
        }

        return "NO";

    }

    private void addEdges(Map<Integer, List<Integer>> adjList, int v, int x, int y, int maxX,int maxY,List<Integer> exclude) {
        //find all eight edges
        List<Integer> adj = getAdj(x, y, 1, maxX);
        ArrayList<Integer> edges = new ArrayList<Integer>();
        int max=(maxX+1)*(maxY+1);
        for (Integer a : adj) {
            if(a>=0 && a<=max && !exclude.contains(a)){
                edges.add(a);
            }
        }
        adjList.put(v,edges);
    }


    private int encode(int x, int y, int x_max){
        int rowSize=x_max+1;
        return (y*rowSize)+x;
    }

    private List<Integer> getAdj(int x, int y, int i, int maxX){
        int n= encode(x,y+i,maxX);
        int ne= encode(x+i,y+1,maxX);
        int nw= encode(x-i,y+1,maxX);
        int s= encode(x,y-i,maxX);
        int se= encode(x+i,y-1,maxX);
        int sw= encode(x-i,y-1,maxX);
        int e= encode(x+i,y,maxX);
        int w= encode(x-i,y,maxX);
        return Arrays.asList(n,ne,nw,s,se,sw,e,w);

    }

    private boolean bfs(Map<Integer, List<Integer>> graph, int start, int end){

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        List<Integer> visited = new ArrayList<Integer>();
        while(!q.isEmpty()){
            Integer v = q.remove();
            if(v==end){
                return true;
            }
            if(!visited.contains(v)){
                visited.add(v);
                List<Integer> edges= graph.get(v);
                if(edges!=null){
                    for (Integer edge : edges) {
                        if(!q.contains(edge)){
                            q.add(edge);
                        }
                    }
                }

            }
        }
        return false;
    }

    private List<Integer> excludeVertex_(int A, int B, ArrayList<Integer> xCenters, ArrayList<Integer> yCenters, int rad,int xMax) {
        ArrayList<Integer> excludes = new ArrayList<Integer>();
        for(int y=0; y<=B; y++){
            for(int x=0; x<=A; x++){
                if(exclude(x,y,xCenters,yCenters,rad)){
                   excludes.add(encode(x,y,xMax));
            }
        }
        }
        // add centers
        for(int i=0; i<xCenters.size(); i++){
            int c = encode(xCenters.get(i), yCenters.get(i), xMax);
            if(!excludes.contains(c)){
                excludes.add(c);
            }
        }
        return excludes;

    }

    private boolean exclude(int x, int y, ArrayList<Integer> xCenters,ArrayList<Integer> yCenters, int rad){
        for(int i=0; i<xCenters.size(); i++){
            Integer xCenter = xCenters.get(i);
            Integer yCenter = yCenters.get(i);
            double r = Math.pow(xCenter-x, 2) + Math.pow(yCenter-y,2);
            if(r<=Math.pow(rad,2)){
                return true;
            }
        }
        return false;

    }
}
