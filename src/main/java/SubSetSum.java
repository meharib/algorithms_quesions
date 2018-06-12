import java.util.Arrays;

/**
 * Created by Mehari on 6/12/18.
 */
public class SubSetSum {

    public boolean subsetSum(int[] input, int sum){
        if(sum==0) return true;
        if(input==null || input.length==0) return false;
        boolean[][] T = new boolean[input.length][sum+1];
        for (int i = 0; i < input.length; i++) {
            for(int j=0; j<sum+1; j++){
                if(j==0 || input[i]==j){
                    T[i][j]=true;
                }else{
                    int previousRow = i-1;
                    int previousCol = j-input[i];
                    if(previousRow>=0 && T[previousRow][j]){
                        T[i][j]=true;
                    }else if(previousRow>=0 && previousCol>=0){
                        T[i][j]=T[previousRow][previousCol];
                    }
                }
            }

        }
        return T[input.length-1][sum];
    }
}
