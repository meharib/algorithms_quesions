package searching;

/**
 * Created by Mehari on 7/6/18.
 */
public class SearchSortedMatrix {
    public static boolean search(int i, int[][] input){
        int rows= input.length;
        int cols = input[0].length;
        int end = (rows * cols) - 1;
        return search(i, input, 0, end,cols);
    }

    private static boolean search(int i, int[][]input, int start, int end, int cols){
        if(start>end){
            return false;
        }
        int mid=(start+end)/2;
        int row = decodeRows(mid,cols);
        int col = decodeCols(mid,cols);
        int current = input[row][col];
        if(current ==i){
            System.out.println(String.format("found at (%s,%s)",row,col));
            return true;
        }

        if(current>i){
            //search left
            return search(i, input, start,mid-1,cols);
        }else{
            return search(i,input,mid+1,end,cols);
        }
    }

    private static int decodeCols(int number, int cols){
        return number%cols;
    }
    private static int decodeRows(int number, int cols){
        return number/cols;
    }
}
