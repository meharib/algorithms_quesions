package binarysearch;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 8/9/18.
 */
public class FindTargetInRotatedSortedArrayTest {

    @Test
    public void test1(){
        int[] arr = {4,5,6,1,2,3};
        assertEquals(5, FindTargetInRotatedSortedArray.find(arr,3));
    }
    @Test
    public void test2(){
        int[] arr = {4,5,6,1,2,3};
        assertEquals(-1, FindTargetInRotatedSortedArray.find(arr,0));
    }

}