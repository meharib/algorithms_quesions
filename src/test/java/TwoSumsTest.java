import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 5/21/18.
 */
public class TwoSumsTest {

    @Test
    public void testTwoSum_1() throws Exception {
        TwoSums twoSums = new TwoSums();
        int[] input = {2,7,11,15};
        int[] result = twoSums.option1(input, 9);
        assertArrayEquals(result, new int[]{2, 7});
    }

    @Test
    public void testTwoSum_2() throws Exception {
        TwoSums twoSums = new TwoSums();
        int[] input = {3,2,4};
        int[] result = twoSums.option1(input, 6);
        assertArrayEquals(result, new int[]{2, 4});
    }

    @Test
    public void testTwoSum_3() throws Exception {
        TwoSums twoSums = new TwoSums();
        int[] input = {2,7,11,15};
        int[] result = twoSums.option2(input, 9);
        assertArrayEquals(result, new int[]{2, 7});
    }

    @Test
    public void testTwoSum_4() throws Exception {
        TwoSums twoSums = new TwoSums();
        int[] input = {3,2,4};
        int[] result = twoSums.option2(input, 6);
        assertArrayEquals(result, new int[]{2, 4});
    }
}