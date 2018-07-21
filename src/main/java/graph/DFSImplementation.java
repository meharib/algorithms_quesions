package graph;

import sorting.IntervalSorting;

import java.util.*;

/**
 * Created by Mehari on 7/19/18.
 */
public class DFSImplementation {

    //option 1: using stack data structure
    public static void dfsWithStack(HashMap<Integer, List<Integer>> graph, int startVertex){
        Stack<Integer> s = new Stack<Integer>();
        HashSet<Integer> visited = new HashSet<Integer>();
        s.add(startVertex);
        while(!s.isEmpty()){
            Integer vertex = s.pop();
            if(!visited.contains(vertex)){
                System.out.println(vertex);
                for(Integer edge: graph.get(vertex)){
                    s.push(edge);
                }
            }

        }
    }

    //option 2: using recursion
    public static void dfsRecursive(HashMap<Integer, List<Integer>> graph, int startVertex){
        HashSet<Integer> visited = new HashSet<Integer>();
        explore(graph,startVertex,visited);
    }
    private static void explore(HashMap<Integer, List<Integer>> graph,int vertex, HashSet<Integer> visited){
        if(visited.contains(vertex)){
            return;
        }else{
            System.out.println(vertex);
            visited.add(vertex);
            for(Integer edge: graph.get(vertex)){
                explore(graph,edge,visited);
            }

        }
    }

    public static void main(String[] args){

        /*
            1
           / \
          2  3
            /  \
           4   5

       4 and 5 will be accessed before 2 with dfs
        * */

        HashMap<Integer, List<Integer>> graph = new HashMap<Integer, List<Integer>>();
        graph.put(1, Arrays.asList(2,3));
        graph.put(2,Arrays.asList());
        graph.put(3,Arrays.asList(4,5));
        graph.put(4,Arrays.asList());
        graph.put(5,Arrays.asList());

        System.out.println("dfs with stack");
        dfsWithStack(graph,1);

                /*
            1
           / \
          2  3
        /  \
       4   5

       4 and 5 will be accessed before 3 with dfs
        * */
        HashMap<Integer, List<Integer>> graph2 = new HashMap<Integer, List<Integer>>();
        graph2.put(1, Arrays.asList(2,3));
        graph2.put(2,Arrays.asList(4,5));
        graph2.put(3,Arrays.asList());
        graph2.put(4,Arrays.asList());
        graph2.put(5,Arrays.asList());

        System.out.println("dfs with recursion");
        dfsRecursive(graph2,1);

    }

}
