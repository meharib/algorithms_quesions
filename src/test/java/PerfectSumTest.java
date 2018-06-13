import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 6/12/18.
 */
public class PerfectSumTest {

    @Test
    public void testPrintSubsets_1() throws Exception {
        PerfectSum perfectSum = new PerfectSum();
        perfectSum.printSubsets(new int[]{2, 3, 5, 6, 8, 10},10);
    }
    @Test
    public void testPrintSubsets_2() throws Exception {
        PerfectSum perfectSum = new PerfectSum();
        perfectSum.printSubsets(new int[]{1, 2, 3, 4, 5},10);
    }
}