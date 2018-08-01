package miscellaneous;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 8/1/18.
 */
public class ArrayQuadrantsTest {

    @Test
    public void testFindArrayQuadruplet_1() throws Exception {
        int[] arr ={2,7,4,0,9,5,1,3};
        int target = 20;
        int[] expected = {0,4,7,9};
        assertArrayEquals(expected,ArrayQuadrants.findArrayQuadruplet(arr,target));
    }
}