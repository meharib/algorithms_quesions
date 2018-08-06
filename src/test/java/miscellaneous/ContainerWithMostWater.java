package miscellaneous;

/**
 * Created by Mehari on 8/6/18.
 */
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int max =0;
        int i =0;
        int j= height.length-1;
        while(i<j){
            int temp = (j - i)* Math.min(height[i], height[j]);
            max = Math.max(max, temp);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }

        return max;

    }
}
