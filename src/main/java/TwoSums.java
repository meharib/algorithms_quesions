import java.util.HashMap;

/**
 * Created by Mehari on 5/21/18.
 */
public class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            Integer value = map.get(nums[i]);
            int key = target-nums[i];
            if(value ==null){
                map.put(key,i);
            }else{
                return new int[]{value,i};
            }

        }
        return null;

    }
}
