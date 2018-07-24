package graph;

import java.util.*;

/**
 * Created by Mehari on 6/8/18.
 */
public class FlowCheckerWithGraph {

    public static boolean doesFlow(int[][] input) {
        //iterate only at the columns of the first row
        for (int i = 0; i < input[0].length; i++) {
            if (input[0][i] == 1) {
                //dfs starting from this input try to reach the bottom row
                if (dfs(0, i, input)) {
                    return true;
                }
            }

        }
        return false;
    }
    private static boolean dfs(int row, int col, int[][] input){
        Stack<int[]> s = new Stack<int[]>();
        s.push(new int[]{row,col});
        while (!s.isEmpty()){
            int[] vertex=s.pop();
            int i = vertex[0]; int j=vertex[1];
            //if we reached bottom row we stop right away
            if(i==input.length-1){
                return true;
            }
            //mark as visited
            input[i][j]=-1;
            //explore in the four directions if index is inbound and value is 1
            //north
            if(i-1>0 && input[i-1][j]==1){
                s.push(new int[]{i-1,j});
            }
            //south
            if(i+1<input.length && input[i+1][j]==1){
                s.push(new int[]{i+1,j});
            }
            //east
            if(j-1>0 && input[i][j-1]==1){
                s.push(new int[]{i,j-1});
            }
            //west
            if(j+1<input[0].length && input[i][j+1]==1){
                s.push(new int[]{i,j+1});
            }
        }
        return false;
    }

}
