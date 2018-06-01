import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 5/30/18.
 */
public class ReverseIntegerTest {

    @Test
    public void testReverse_1() throws Exception {
        ReverseInteger reverse = new ReverseInteger();
        int actual = reverse.reverse(123);
        assertEquals(321,actual);
    }
    @Test
    public void testReverse_2() throws Exception {
        ReverseInteger reverse = new ReverseInteger();
        int actual = reverse.reverse(-123);
        assertEquals(-321,actual);
    }
    @Test
    public void testReverse_3() throws Exception {
        ReverseInteger reverse = new ReverseInteger();
        int actual = reverse.reverse(0);
        assertEquals(0,actual);
    }
    @Test
    public void testReverse_4() throws Exception {
        ReverseInteger reverse = new ReverseInteger();
        int actual = reverse.reverse(111);
        assertEquals(111,actual);
    }

    @Test
    public void testReverse_5() throws Exception {
        ReverseInteger reverse = new ReverseInteger();
        int actual = reverse.reverse(-2147483648);
        assertEquals(0,actual);
    }
}