package binarysearch;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 8/8/18.
 */
public class DivideTwoIntegersTest {

    @Test
    public void testDivide_1() throws Exception {
        int actual = DivideTwoIntegers.divide(7, 3);
        assertEquals(2,actual);
    }

    @Test
    public void testDivide_2() throws Exception {
        int actual = DivideTwoIntegers.divide(7, -3);
        assertEquals(-2,actual);
    }
    @Test
    public void testDivide_3() throws Exception {
        int actual = DivideTwoIntegers.divide(1, 5);
        assertEquals(0,actual);
    }
    @Test
    public void testDivide_4() throws Exception {
        int actual = DivideTwoIntegers.divide(0, 5);
        assertEquals(0,actual);
    }
}