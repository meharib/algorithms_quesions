package miscellaneous;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 8/10/18.
 */
public class MatrixSpiralCopyTest {

    @Test
    public void testSpiralCopy_1() throws Exception {
        int[][] input = {
                          {1,2,3},
                          {4,5,6},
                          {7,8,9}
        };
        int[] expected = {1,2,3,6,9,8,7,4,5};
        assertArrayEquals(expected, MatrixSpiralCopy.spiralCopy(input));
    }
    @Test
    public void testSpiralCopy_2() throws Exception {
        int[][] input = {{1,2,3}};
        int[] expected = {1,2,3};
        assertArrayEquals(expected, MatrixSpiralCopy.spiralCopy(input));
    }
}