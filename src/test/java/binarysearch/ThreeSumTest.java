package binarysearch;

import org.junit.Test;
import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 8/14/18.
 */
public class ThreeSumTest {

    @Test
    public void testThreeSum() throws Exception {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> actual = ThreeSum.threeSum(arr);
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(-1,-1,2));
        expected.add(Arrays.asList(-1,-0,1));
        assertEquals(expected,actual);
    }
}