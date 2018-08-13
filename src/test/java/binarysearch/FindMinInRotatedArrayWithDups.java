package binarysearch;

/**
 * Created by Mehari on 8/12/18.
 */
public class FindMinInRotatedArrayWithDups {
    public static int findMin(int[] nums) {
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            //if array is sorted or there is only one elment return the first element
            if(nums[start] < nums[end] || start == end){
                return nums[start];
            }
            int mid = (start + end)/2;
            //if the current middle is greater is the element before it, then it is the smallest
            if(mid-1>=0 && nums[mid-1]>nums[mid]){
                return nums[mid];
            }
            //if the midle is greater than the start then we can move the start because we already know that the start is greater              than the end.
            //similarly we know that the end is smaller than the start so if we find the mid element is smaller than the end                 element we move the end to the middle
            //otherwise if either the start or the end are equal to the middle we don't know anythign so we simply eliminate                 these elements since they are duplicate
            if(nums[mid]>nums[start]){
                start = mid+1;
            }else if(nums[mid]<nums[end]){
                end = mid -1;
            } else if(nums[mid]==nums[start]){
                start ++;
            }else if(nums[mid]==nums[end]){
                end --;
            }

        }
        return nums[0];
    }

}
