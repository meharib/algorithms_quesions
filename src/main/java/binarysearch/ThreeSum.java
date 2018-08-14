package binarysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Mehari on 8/14/18.
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        /*
        - the tree sum problem can be converted in to a two sum problem
        - a + b + c =0 => b + c = -a
        - therefore we iterate over each element and check to see if the remaining elements can have a target of -a
        - to avoid duplicates, since we are sorting the array first, if the element at nums[i-1] == nums[i]
          we skip and we move on until we find a different element
        - we do this check both on the 2SUM problem and the 3SUM problem


         */
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int len = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<len; i++){
            int j=i+1;
            int k = len-1;
            int target = -1 * nums[i];
            //if the number is the same avoid duplicates by skiping it
            if(i-1<0 || nums[i]!=nums[i-1]){
                while(j<k){
                    int temp = nums[j] + nums[k];
                    if(temp==target){
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        j++; k--;
                        //if the number is the same as pervious keep moving until we find a different number
                        while (j<k){
                            if(nums[j]==nums[j-1]){
                                j++;
                            }else{
                                break;
                            }
                        }
                    }else if(temp >target){
                        k--;
                    }else{
                        j++;
                    }
                }
            }
        }
        return result;
    }
}
