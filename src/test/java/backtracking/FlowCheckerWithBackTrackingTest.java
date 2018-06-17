package backtracking;

import backtracking.FlowCheckerWithBackTracking;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 6/17/18.
 */
public class FlowCheckerWithBackTrackingTest {

    @Test
    public void testDoesFlow_1() throws Exception {
        int[][] input = {
                {1,0,1},
                {0,0,1},
                {0,0,1}};
        assertTrue(FlowCheckerWithBackTracking.doesFlow(input));
    }

    @Test
    public void testDoesFlow_2() throws Exception {
        int[][] input = {
                {1,0,1},
                {0,0,1},
                {0,0,0}};
        assertFalse(FlowCheckerWithBackTracking.doesFlow(input));
    }
    @Test
    public void testDoesFlow_3() throws Exception {
        int[][] input = {{1,0,1}};
        assertTrue(FlowCheckerWithBackTracking.doesFlow(input));
    }
    @Test
    public void testDoesFlow_4() throws Exception {
        int[][] input = {{0,0,0}};
        assertFalse(FlowCheckerWithBackTracking.doesFlow(input));
    }
}