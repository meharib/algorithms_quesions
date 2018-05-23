import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 5/22/18.
 */
public class LongestNonRepeatingSubstringTest {

    @Test
    public void testLengthOfLongestSubstring_1() throws Exception {
        LongestNonRepeatingSubstring substring = new LongestNonRepeatingSubstring();
        assertEquals(3,substring.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void testLengthOfLongestSubstring_2() throws Exception {
        LongestNonRepeatingSubstring substring = new LongestNonRepeatingSubstring();
        assertEquals(3,substring.lengthOfLongestSubstring("dvdf"));
    }
    @Test
    public void testLengthOfLongestSubstring_3() throws Exception {
        LongestNonRepeatingSubstring substring = new LongestNonRepeatingSubstring();
        assertEquals(3,substring.lengthOfLongestSubstring("pwwkew"));
    }
    @Test
    public void testLengthOfLongestSubstring_4() throws Exception {
        LongestNonRepeatingSubstring substring = new LongestNonRepeatingSubstring();
        assertEquals(1,substring.lengthOfLongestSubstring("p"));
    }
    @Test
    public void testLengthOfLongestSubstring_5() throws Exception {
        LongestNonRepeatingSubstring substring = new LongestNonRepeatingSubstring();
        assertEquals(1,substring.lengthOfLongestSubstring("k"));
    }
    @Test
    public void testLengthOfLongestSubstring_6() throws Exception {
        LongestNonRepeatingSubstring substring = new LongestNonRepeatingSubstring();
        assertEquals(0,substring.lengthOfLongestSubstring(""));
    }
    @Test
    public void testLengthOfLongestSubstring_7() throws Exception {
        LongestNonRepeatingSubstring substring = new LongestNonRepeatingSubstring();
        assertEquals(2,substring.lengthOfLongestSubstring("abba"));
    }
}