import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 5/30/18.
 */
public class ZigZagConversionTest {

    @Test
    public void testConvert_1() throws Exception {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String actual = zigZagConversion.convert("ABCDEFGHI", 4);
        assertEquals("AGBFHCEID",actual);
    }

    @Test
    public void testConvert_2() throws Exception {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String actual = zigZagConversion.convert("PAYPALISHIRING", 3);
        assertEquals("PAHNAPLSIIGYIR",actual);
    }

    @Test
    public void testConvert_4() throws Exception {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String actual = zigZagConversion.convert("PAYPALISHIRING", 4);
        assertEquals("PINALSIGYAHRPI",actual);
    }
    @Test
    public void testConvert_5() throws Exception {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String actual = zigZagConversion.convert("ABC", 1);
        assertEquals("ABC",actual);
    }

    @Test
    public void testConvert_6() throws Exception {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String actual = zigZagConversion.convert("ABC", 2);
        assertEquals("ACB",actual);
    }
    @Test
    public void testConvert_7() throws Exception {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String actual = zigZagConversion.convert("ABC", 3);
        assertEquals("ABC",actual);
    }
    @Test
    public void testConvert_8() throws Exception {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String actual = zigZagConversion.convert("ABC", 10);
        assertEquals("ABC",actual);
    }

    @Test
    public void testConvert_9() throws Exception {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String actual = zigZagConversion.convert("ABCDE", 4);
        assertEquals("ABCED",actual);
    }
}