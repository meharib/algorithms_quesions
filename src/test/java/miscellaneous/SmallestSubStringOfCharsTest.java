package miscellaneous;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 7/4/18.
 */
public class SmallestSubStringOfCharsTest {

    @Test
    public void testGetShortestUniqueSubstring_1() throws Exception {
        char[] arr = {'x'};
        String str = "x";
        String actual = SmallestSubStringOfChars.getShortestUniqueSubstring(arr, str);
        assertEquals("x",actual);
    }

    @Test
    public void testGetShortestUniqueSubstring_2() throws Exception {
        char[] arr = {'x'};
        String str = "y";
        String actual = SmallestSubStringOfChars.getShortestUniqueSubstring(arr, str);
        assertEquals("",actual);
    }
    @Test
    public void testGetShortestUniqueSubstring_3() throws Exception {
        char[] arr = {'x','y','z'};
        String str = "xyyzyzyx";
        String actual = SmallestSubStringOfChars.getShortestUniqueSubstring(arr, str);
        assertEquals("zyx",actual);
    }
}