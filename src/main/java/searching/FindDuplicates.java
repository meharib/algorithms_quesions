package searching;

import java.util.Arrays;

/**
 * Created by Mehari on 7/15/18.
 */
public class FindDuplicates {

    public static int[] findDuplicates(int[] arr1, int[] arr2){
        //option 1: use binary search to search through the larger size array
        //int[] result = option1(arr1, arr2);
        int[] result = option2(arr1, arr2);
        return result;
    }



    private static int[] option1(int[] arr1, int[] arr2) {
        if(arr1.length>arr2.length){
            return findDuplicatesOption1(arr1,arr2);
        }else return findDuplicatesOption1(arr2,arr1);
    }

    private static int[] findDuplicatesOption1(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int j=0;
        for (int i = 0; i < arr1.length; i++) {
            if(found(arr1[i], arr2, 0, arr2.length-1)){
               result[j]=arr1[i];
                j++;
            }
        }
        //trim the length of the array to remove empty spaces
        return Arrays.copyOf(result,j);
    }

    //binary search implementation
    private static boolean found(int i, int[] arr2, int start, int end) {
        if(start>end){
            return false;
        }
        int mid = (start + end)/2;
        int current=arr2[mid];
        if(current==i){
            return true;
        }else if(current>i){
            return found(i, arr2, 0, mid-1);
        }else{
            return found(i, arr2,mid+1,end);
        }
    }

    /** option 2 **/
    private static int[] option2(int[] arr1, int[] arr2) {
        int i =0;
        int j=0;
        int k=0;
        int[] result = new int[arr1.length];
        while (i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                result[k]= arr1[i];
                i++; j++;k++;
            }else if(arr1[i]<arr2[j]){
                i++;
            }else{
                j++;
            }
        }
        return Arrays.copyOf(result,k);
    }
}
