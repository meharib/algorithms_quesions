package binarysearch;

/**
 * Created by Mehari on 8/9/18.
 */
public class FirstAndLastPosition {
    public static int[] searchRange(int[] nums, int target) {
        if(nums==null || nums.length==0){
            return new int[]{-1,-1};
        }

        //find starting index
        int startIndex = getStartIndex(nums, target);
        if(startIndex==-1){
            return new int[]{-1,-1};
        }

        //find end index, if it does not exist return start index only
        int endIndex = getEndIndex(nums, startIndex, target);
        if(endIndex==-1){
            return new int[]{startIndex, startIndex};
        }
        return new int[]{startIndex, endIndex};

    }

    //find the left most element that is equal to the target
    //check to see the previous element is less than the target
    private static int getStartIndex(int[] nums, int target){
        int start=0;
        int end =nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target && (mid==0 || (mid-1>=0 && nums[mid-1]<nums[mid]))){
                return mid;
            }else if(target <= nums[mid]){
                end = mid-1;
            }else if(target > nums[mid]){
                start = mid+1;
            }
        }
        return -1;
    }


    private static int getEndIndex(int[] nums, int startIndex, int target){
        int start = startIndex +1;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(nums[mid]==target && (mid==nums.length-1 || (mid+1<=nums.length-1 && nums[mid]<nums[mid+1]))){
                return mid;
            }else if(target>=nums[mid]){
                start = mid+1;
            }else if(target < nums[mid]){
                end = mid-1;
            }
        }
        return -1;
    }
}
