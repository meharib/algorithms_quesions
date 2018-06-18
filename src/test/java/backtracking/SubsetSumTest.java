package backtracking;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 6/17/18.
 */
public class SubsetSumTest {

    @Test
    public void testSolve_1() throws Exception {
        SubsetSum subsetSum = new SubsetSum();
        int[] x = {2,3,4};
        int target = 7;
        assertTrue(subsetSum.solve(x,target));
    }

    @Test
    public void testSolve_2() throws Exception {
        SubsetSum subsetSum = new SubsetSum();
        int[] x = {2,3,4};
        int target = 11;
        assertFalse(subsetSum.solve(x,target));
    }
}