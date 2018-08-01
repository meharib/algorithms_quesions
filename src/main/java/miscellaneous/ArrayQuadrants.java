package miscellaneous;

import java.util.Arrays;

/**
 * Created by Mehari on 8/1/18.
 */
public class ArrayQuadrants {

    static int[] findArrayQuadruplet(int[] arr, int s) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int sum = arr[i] + arr[j];
                if(sum<=s){
                    int target = s - sum;
                    int k=j+1;
                    int l= arr.length-1;
                    while(k<l){
                        int tempSum = arr[k] + arr[l];
                        if(tempSum==target){
                            return new int[]{arr[i], arr[j], arr[k],arr[l]};
                        }else if(tempSum>target){
                            l--;
                        }else{
                            k++;
                        }
                    }
                }

            }
        }
        return new int[0];


    }
}
