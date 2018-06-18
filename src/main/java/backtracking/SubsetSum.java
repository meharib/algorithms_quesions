package backtracking;

/**
 * Created by Mehari on 6/17/18.
 */
public class SubsetSum {
    public boolean solve(int[] input, int target){
        for (int i = 0; i < input.length; i++) {
            if(subsetSum(0,i,input,target)){
                return true;
            }
        }
        return false;
    }

    private boolean subsetSum(int currentSum, int index, int[] input, int target) {
        int currentElement=input[index];
        currentSum+=currentElement;
        if(currentSum==target){
            return true;
        }else if(currentSum<target){
            index++;
            for (int i = index; i < input.length; i++) {
                if(subsetSum(currentSum, index, input, target)){
                    return true;
                }
            }
        }
        return false;
    }
}
