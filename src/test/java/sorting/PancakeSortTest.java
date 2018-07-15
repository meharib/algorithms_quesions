package sorting;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Mehari on 7/14/18.
 */
public class PancakeSortTest {

    @Test
    public void test_1() {
        int[] arr = {5, 4, 3, 2, 1};
        PancakeSort.pancakeSort(arr);
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arr);
    }

    @Test
    public void test_2(){
        int[] arr = {2,3,2};
        PancakeSort.pancakeSort(arr);
        int[] expected = {2,2,3};
        assertArrayEquals(expected,arr);
    }
    @Test
    public void test_3(){
        int[] arr = {3};
        PancakeSort.pancakeSort(arr);
        int[] expected = {3};
        assertArrayEquals(expected,arr);
    }


}