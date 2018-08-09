package binarysearch;

/**
 * Created by Mehari on 8/9/18.
 */
public class FindTargetInRotatedSortedArray {

    public static int find(int[]nums, int target){
        int pivot = findPivot(nums);
        int start =0;
        int end = nums.length-1;
        //if pivot is zero we do a normal binary search
        if(pivot!=0){
            //check left side of the pivot
            if(nums[0]<=target && nums[pivot-1]>=target){
                end=pivot-1;
            //check the right side of the pivot
            }else if(nums[pivot]<=target && nums[end]>=target){
                start=pivot;
            }else{
                return -1;
            }
        }

        while (start<=end){
            int mid = (start + end)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start= mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

    //take the middle element and compare it to the start and the end of the array
    // repeat until we find the pivot
    private static int findPivot(int[] nums){
        int start =0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(mid-1>=0 && nums[mid]<nums[mid-1]){
                return mid;
            }else if(nums[mid]> nums[nums.length-1]){
                start=mid+1;
            }else if(nums[mid]<nums[0]){
                end = mid-1;
            }else{
                //array is already sorted
                return 0;
            }
        }
        return 0;
    }
}
