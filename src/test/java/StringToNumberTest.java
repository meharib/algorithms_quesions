import org.junit.Test;
import org.omg.CORBA.INTERNAL;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 5/31/18.
 */
public class StringToNumberTest {

    @Test
    public void testMyAtoi_1() throws Exception {
        StringToNumber stringToNumber = new StringToNumber();
        int actual = stringToNumber.myAtoi("42");
        assertEquals(42,actual);
    }
    @Test
    public void testMyAtoi_2() throws Exception {
        StringToNumber stringToNumber = new StringToNumber();
        int actual = stringToNumber.myAtoi("-42");
        assertEquals(-42,actual);
    }
    @Test
    public void testMyAtoi_3() throws Exception {
        StringToNumber stringToNumber = new StringToNumber();
        int actual = stringToNumber.myAtoi(" -42 w");
        assertEquals(-42,actual);
    }

    @Test
    public void testMyAtoi_4() throws Exception {
        StringToNumber stringToNumber = new StringToNumber();
        int actual = stringToNumber.myAtoi(" w-42 w");
        assertEquals(0,actual);
    }
    @Test
    public void testMyAtoi_5() throws Exception {
        StringToNumber stringToNumber = new StringToNumber();
        int actual = stringToNumber.myAtoi("-999999999999999999");
        assertEquals(Integer.MIN_VALUE,actual);
    }
    @Test
    public void testMyAtoi_6() throws Exception {
        StringToNumber stringToNumber = new StringToNumber();
        int actual = stringToNumber.myAtoi("999999999999999999");
        assertEquals(Integer.MAX_VALUE,actual);
    }
    @Test
    public void testMyAtoi_7() throws Exception {
        StringToNumber stringToNumber = new StringToNumber();
        int actual = stringToNumber.myAtoi("");
        assertEquals(0,actual);
    }
    @Test
    public void testMyAtoi_8() throws Exception {
        StringToNumber stringToNumber = new StringToNumber();
        int actual = stringToNumber.myAtoi("-");
        assertEquals(0,actual);
    }
    @Test
    public void testMyAtoi_9() throws Exception {
        StringToNumber stringToNumber = new StringToNumber();
        int actual = stringToNumber.myAtoi("-w");
        assertEquals(0,actual);
    }
}