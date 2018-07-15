package sorting;

/**
 * Created by Mehari on 7/14/18.
 */
public class PancakeSort {

    public static void pancakeSort(int[] arr){
        for (int i = arr.length-1; i >=0 ; i--) {
            int maxIndex = findMaxElementIndex(arr, i);
            flip(arr,maxIndex);
            flip(arr,i);
        }

    }

    private static int findMaxElementIndex(int[] arr, int upperBoundIndex) {
        int maxIndex=0;
        for (int i = 1; i <= upperBoundIndex; i++) {
            if(arr[i]>arr[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }


    private static void flip(int[] arr, int k){
        int start =0;
        while (start<k){
            int temp = arr[start];
            arr[start]=arr[k];
            arr[k]=temp;
            start++;k--;
        }
    }

}
