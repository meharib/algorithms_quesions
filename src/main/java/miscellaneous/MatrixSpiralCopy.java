package miscellaneous;

/**
 * Created by Mehari on 8/10/18.
 */
public class MatrixSpiralCopy {
    public static int[] spiralCopy(int[][] arr) {

        //size of output array
        int size = (arr[0].length * arr.length);

        int[] ans = new int[size];

        //initialize four counters for the top, bottom left and right
        int topRow =0;
        int bottomRow = arr.length-1;
        int leftCol =0;
        int rightCol = arr[0].length-1;
        int i=0;

        // we alternate between top -> right ->bottom -> left
        // we also change the direction we traverse the array at each couter
        while(topRow<=bottomRow && leftCol<=rightCol){
            //left to right
            for(int c=leftCol; c<=rightCol; c++){
                ans[i] = arr[topRow][c];
                i++;
            }
            topRow++;

            //top to bottom
            if(topRow<=bottomRow && leftCol<=rightCol){
                for(int r=topRow; r<=bottomRow; r++){
                    System.out.println(" top to bottom:" + r + "," + rightCol + "i:" + i );
                    ans[i] = arr[r][rightCol];
                    i++;
                }
                rightCol--;
            }

            if(topRow<=bottomRow && leftCol<=rightCol){
                //right to left
                for(int c=rightCol; c>=leftCol; c--){
                    ans[i] = arr[bottomRow][c];
                    i++;
                }
                bottomRow--;
            }



            //bottom to top
            if(topRow<=bottomRow && leftCol<=rightCol){
                for(int r = bottomRow; r>=topRow; r--){
                    ans[i] = arr[r][leftCol];
                    i++;
                }
                leftCol++;
            }
        }
        return ans;
    }

}
