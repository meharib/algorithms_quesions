import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by Mehari on 5/21/18.
 */
public class TwoSums {
    public int[] option1(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer value = map.get(nums[i]);
            int key = target-nums[i];
            if(value ==null){
                map.put(key,i);
            }else{
                return new int[]{nums[map.get(value)],nums[i]};
            }

        }
        return null;

    }

    public int[] option2(int[] nums, int target){
        int i=0;
        int j=nums.length-1;
        Arrays.sort(nums);
        while (i<j){
            int tempSum = nums[i]+nums[j];
            if(tempSum == target){
                return new int[]{nums[i],nums[j]};
            }else if(tempSum<target){
                i++;
            }else{
                j--;
            }
        }
        return null;

    }
}
