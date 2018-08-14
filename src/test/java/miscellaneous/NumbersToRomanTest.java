package miscellaneous;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 8/13/18.
 */
public class NumbersToRomanTest {

    @Test
    public void testIntToRoman_1() throws Exception {
        assertEquals("XIV", NumbersToRoman.intToRoman(14));
    }

    @Test
    public void testIntToRoman_2() throws Exception {
        assertEquals("XVI", NumbersToRoman.intToRoman(16));
    }
}