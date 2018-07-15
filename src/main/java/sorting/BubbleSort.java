package sorting;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Mehari on 7/10/18.
 */
public class BubbleSort {

    public static void sort(int[] arr){
        boolean sorted=false;
        while (!sorted){
            sorted=true;
            for (int i = 1; i < arr.length; i++) {
                if(arr[i-1]>arr[i]){
                    swap(arr, i-1, i);
                    sorted=false;
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
