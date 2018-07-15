package sorting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 7/10/18.
 */
public class BubbleSortTest {

    @Test
    public void test_1(){
        int[] arr = {5,1,4,2,8};
        int[] expected = {1,2,4,5,8};
        BubbleSort.sort(arr);
        assertArrayEquals(expected,arr);
    }

    @Test
    public void test_2(){
        int[] arr = {5,4,3,2,1};
        int[] expected = {1,2,3,4,5};
        BubbleSort.sort(arr);
        assertArrayEquals(expected,arr);
    }
}