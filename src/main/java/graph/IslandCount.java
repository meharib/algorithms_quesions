package graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Mehari on 7/23/18.
 */
public class IslandCount {
    public static int getNumberOfIslands(int[][] arr) {
        int components =0;
        for(int i =0; i< arr.length; i++){
            for(int j=0; j< arr[0].length; j++){
                //do bfs if it is the start of the island and mark all connected cells -1 with bfs/dfs
                if(arr[i][j]==1){
                    components++;
                    bfs(i,j,arr);
                }
            }
        }
        return components;

    }

    private static void bfs(int i, int j, int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        Queue<int[]> q = new LinkedList<int[]>();
        q.add(new int[]{i,j});
        while(!q.isEmpty()){
            int[] v = q.remove();
            int r = v[0]; int c = v[1];
            arr[v[0]][v[1]]=-1;
            //north
            if(r-1 >=0 && arr[r-1][c]==1){
                q.add(new int[]{r-1,c});
            }
            //south
            if(r+1<rows && arr[r+1][c]==1){
                q.add(new int[]{r+1,c});
            }
            //east
            if(c-1>=0 && arr[r][c-1]==1){
                q.add(new int[]{r,c-1});
            }
            //west
            if(c+1<cols && arr[r][c+1]==1){
                q.add(new int[]{r,c+1});
            }

        }
    }
}
