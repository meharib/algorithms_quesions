package binarysearch;

/**
 * Created by Mehari on 8/8/18.
 */
public class DivideTwoIntegers {
    public static int divide(int numerator, int denominator){
        //if one of them is less than zero the sign is negative
        boolean isPositive =true;
        if((numerator<0 && denominator>=0) || (denominator<0 && numerator>0)){
            isPositive=false;
        }
        //get the long values of the integer to deal with edge case
        long longNumerator = Math.abs(((long)numerator));
        long longDenominator = Math.abs(((long)denominator));

        //add the denominator to it self continuously until we find a solution like denominator * count <= numerator
        long result = divideLong(longNumerator, longDenominator);
        //apply sign
        if(!isPositive){
            result=0-result;
        }
        //check if it exceeds maximum int range
        if(result<Integer.MIN_VALUE || result > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        return  (int)result;

    }


    //the inputs here are always positive numbers
    //for performance improvement instead of adding the denominator every time we double the previous sum at each iteration
    //once we found a sum that satisfy the condition, we repeat the same thing with the left over element
    //for example given input 16, 3 -> our sum will be 3,6,12,24 we stop when the sum is 12 and we call the same method with 16-12 =4 and 3

    private static long divideLong(long numerator, long denominator){
        if(numerator<denominator){
            return 0;
        }
        long count =1;
        long sum= denominator;
        while(sum+sum<=numerator){
            sum+=sum;
            count+=count;
        }
        long diff = numerator-sum;
        return count + divideLong(diff,denominator);
    }
}
