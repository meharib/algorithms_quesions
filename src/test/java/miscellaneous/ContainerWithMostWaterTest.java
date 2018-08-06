package miscellaneous;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 8/6/18.
 */
public class ContainerWithMostWaterTest {

    @Test
    public void testMaxArea() throws Exception {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        assertEquals(49, ContainerWithMostWater.maxArea(heights));


    }
}