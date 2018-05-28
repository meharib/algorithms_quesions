import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 5/24/18.
 */
public class SortedArraysMedianTest {

    @Test
    public void testFindMedianSortedArrays_1() throws Exception {
        SortedArraysMedian sortedArraysMedian = new SortedArraysMedian();
        double actual = sortedArraysMedian.findMedianSortedArrays(new int[]{2, 3, 4}, new int[]{5, 6, 7, 8});
        assertEquals(5.0,actual,0);
    }

    @Test
    public void testFindMedianSortedArrays_2() throws Exception {
        SortedArraysMedian sortedArraysMedian = new SortedArraysMedian();
        double actual = sortedArraysMedian.findMedianSortedArrays(new int[]{2, 3, 4}, new int[]{5, 6, 7});
        assertEquals(4.5,actual,0);
    }
    @Test
    public void testFindMedianSortedArrays_3() throws Exception {
        SortedArraysMedian sortedArraysMedian = new SortedArraysMedian();
        double actual = sortedArraysMedian.findMedianSortedArrays(new int[]{2}, new int[]{5});
        assertEquals(3.5,actual,0);
    }
    @Test
    public void testFindMedianSortedArrays_4() throws Exception {
        SortedArraysMedian sortedArraysMedian = new SortedArraysMedian();
        double actual = sortedArraysMedian.findMedianSortedArrays(new int[]{1,3,5,7}, new int[]{2,4,6});
        assertEquals(4,actual,0);
    }
    @Test
    public void testFindMedianSortedArrays_5() throws Exception {
        SortedArraysMedian sortedArraysMedian = new SortedArraysMedian();
        double actual = sortedArraysMedian.findMedianSortedArrays(new int[]{1}, new int[]{2,4,6});
        assertEquals(3,actual,0);
    }
    @Test
    public void testFindMedianSortedArrays_6() throws Exception {
        SortedArraysMedian sortedArraysMedian = new SortedArraysMedian();
        double actual = sortedArraysMedian.findMedianSortedArrays(new int[]{1,5,7,8,10}, new int[]{2});
        assertEquals(6,actual,0);
    }
    @Test
    public void testFindMedianSortedArrays_7() throws Exception {
        SortedArraysMedian sortedArraysMedian = new SortedArraysMedian();
        double actual = sortedArraysMedian.findMedianSortedArrays(new int[]{1,3}, new int[]{2});
        assertEquals(2,actual,0);
    }
    @Test
    public void testFindMedianSortedArrays_8() throws Exception {
        SortedArraysMedian sortedArraysMedian = new SortedArraysMedian();
        double actual = sortedArraysMedian.findMedianSortedArrays(new int[]{1,2,3}, new int[]{1,2});
        assertEquals(2,actual,0);
    }
}