import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 6/12/18.
 */
public class SubSetSumTest {

    @Test
    public void testSubsetSum_1() throws Exception {
        SubSetSum subsetSum = new SubSetSum();
        assertTrue(subsetSum.subsetSum(new int[]{3, 34, 4, 12, 5, 2}, 9));
    }
    @Test
    public void testSubsetSum_2() throws Exception {
        SubSetSum subsetSum = new SubSetSum();
        assertFalse(subsetSum.subsetSum(new int[]{3}, 9));
    }
    @Test
    public void testSubsetSum_3() throws Exception {
        SubSetSum subsetSum = new SubSetSum();
        assertTrue(subsetSum.subsetSum(new int[]{}, 0));
    }
    @Test
    public void testSubsetSum_4() throws Exception {
        SubSetSum subsetSum = new SubSetSum();
        assertFalse(subsetSum.subsetSum(new int[]{}, 9));
    }
}