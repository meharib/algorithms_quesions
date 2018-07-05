package sorting;

/**
 * Created by Mehari on 7/5/18.
 */
public class QuickSort {
    public static void quickSort(int[] x){
        sort(x,0,x.length-1);
    }

    private static void sort(int[] x, int low, int high){
        int i=low;
        int j=high;
        int pivot = (low + high)/2;
        while (i<j){

            //find left index
            while(x[i]<=x[pivot] && i < pivot){
                i++;
            }
            //find right index
            while (x[j]>=x[pivot] && j > pivot){
                j--;
            }
            if(i<j){
                swap(i,j,x);
            }

        }
        //sort left
        if(low<pivot-1){
            sort(x,low,pivot-1);
        }
        //sort right
        if(pivot+1<high){
            sort(x,pivot+1,high);
        }

    }
    private static void swap(int j, int i, int[] x) {
        int temp = x[j];
        x[j]=x[i];
        x[i]=temp;
    }
}
