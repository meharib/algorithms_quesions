package backtracking;

/**
 * Created by Mehari on 6/17/18.
 */
public class FlowCheckerWithBackTracking {

    public static boolean doesFlow(int[][] input){
        for(int i=0; i<input.length; i++){
            if(input[0][i]==1){
                if(explore(0,i, input)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean explore(int r, int c, int[][]input){
        //check if it is within bound
        if(r<0 || c<0 || r > input.length-1 || c>input[0].length-1){
            return false;
        }
        //check if visited
        if(input[r][c]!=-1){
            if(input[r][c]==0){
                input[r][c]=-1;
            }else if(input[r][c]==1){
                //if it is the last row stop searching
                if(r==input.length-1){
                    return true;
                }
                //mark it as visited
                input[r][c]=-1;
                //explore in the four directions return true if one of them succeeds
                //return north or south or east or west
                    return explore(r-1,c,input)||explore(r+1,c,input)||explore(r,c+1,input)|| explore(r,c-1,input);
            }
        }
        return false;

    }
}
