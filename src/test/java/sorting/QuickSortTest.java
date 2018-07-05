package sorting;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 7/5/18.
 */
public class QuickSortTest {
    @Test
    public void test1(){
        int[] x = {1};
        QuickSort.quickSort(x);
        assertEquals(1, x[0]);
    }
    @Test
    public void test2(){
        int[] x = {2,1};
        QuickSort.quickSort(x);
        int[] expected = {1,2};
        assertArrayEquals(expected,x);
    }
    @Test
    public void test3(){
        int[] x = {2,1,2};
        QuickSort.quickSort(x);
        int[] expected = {1,2,2};
        assertArrayEquals(expected,x);
    }
    @Test
    public void test4(){
        int[] x = {0,6,4,3,5,1,2,6};
        QuickSort.quickSort(x);
        int[] expected = {0,1,2,3,4,5,6,6};
        assertArrayEquals(expected,x);
    }

}