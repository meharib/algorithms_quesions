import java.util.*;

/**
 * Created by Mehari on 6/8/18.
 */
public class FlowCheckerWithGraph {

    public static boolean doesFlow(int[][] input){
        //construct the graph
        int rows = input.length;
        int cols= input[0].length;
        final int START = -1;
        final int END = rows*cols;
        HashMap<Integer, List<Integer>> g = new HashMap<Integer,List<Integer>>();
        //each vertex can have a maximum of 4 vertices
        HashMap<Integer, int[]> graph = new HashMap<Integer, int[]>();

        //create the top edges
        for (int i = 0; i < cols; i++) {
            if (input[0][i] == 1) {
                int v = getVertex(0, i, cols);
                addVertex(g, START, v);
                addVertex(g, v, START);
            }
        }
        //create bottom edges
        for (int i = 0; i <cols; i++) {
            if(input[rows-1][i]==1){
                int v = getVertex(rows - 1, i, cols);
                addVertex(g, END, v);
                addVertex(g, v,END);
            }
        }
        //create in-between edges
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(input[i][j]==1){
                    //north
                    if(isEdge(i-1,j,input,rows,cols)){
                        addVertex(g,getVertex(i,j,cols), getVertex(i-1,j,cols));
                    }
                    //south
                    if(isEdge(i+1,j,input,rows,cols)){
                        addVertex(g,getVertex(i,j,cols), getVertex(i+1,j,cols));
                    }
                    //east
                    if(isEdge(i,j+1,input,rows,cols)){
                        addVertex(g,getVertex(i,j,cols), getVertex(i,j+1,cols));
                    }
                    //west
                    if(isEdge(i,j-1,input,rows,cols)){
                        addVertex(g,getVertex(i,j,cols), getVertex(i-1,j,cols));
                    }

                }
            }
        }

        //we can do either bfs and dfs here. Both works

        //return bfs(g, START,END);
        return dfs(g, START,END);



    }

    private static void addVertex(HashMap<Integer, List<Integer>> g, int vertex, int edge) {
        List<Integer> v = g.get(vertex);
        if(v==null){
            ArrayList<Integer> edges = new ArrayList<Integer>();
            edges.add(edge);
            g.put(vertex, edges);
        }else{
            v.add(edge);
        }
    }

    public static int getVertex(int row,int col, int m){
        return (row*m) + col;
    }
    public static boolean isEdge(int i, int j, int[][] input, int n, int m){
        if(i<0 || i >n-1 || j<0|| j>m-1){
            return false;
        }
        return input[i][j]==1;

    }

    private static boolean bfs(HashMap<Integer, List<Integer>> g, Integer start, Integer end){
        LinkedList<Integer> q = new LinkedList<Integer>();
        q.add(start);
        Set visited= new HashSet<Integer>();
        while(!q.isEmpty()){
            Integer v = q.pop();
            if(!visited.contains(v)){
                visited.add(v);
                if(v==end){
                    return true;
                }
            List<Integer> edges = g.get(v);
            if(edges!=null){
                for (Integer u : edges) {
                    if(!q.contains(u) && !visited.contains(u)){
                        q.add(u);
                    }
                }
            }
            }
        }
        return false;
    }

    private static boolean dfs(HashMap<Integer, List<Integer>> g, Integer start, Integer end){
        Stack<Integer> s = new Stack<Integer>();
        s.push(start);
        Set<Integer> visited = new HashSet<Integer>();
        while (!s.isEmpty()){
            Integer v = s.pop();
            visited.add(v);
            if(v==end) return true;
            List<Integer> edges = g.get(v);
            if(edges!=null){
                for(Integer u : edges){
                    if(!visited.contains(u) && !s.contains(u)){
                        s.add(u);
                    }
                }
            }
        }
        return false;
    }
}
