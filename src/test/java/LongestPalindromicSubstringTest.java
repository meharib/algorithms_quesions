import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 5/30/18.
 */
public class LongestPalindromicSubstringTest {

    @Test
    public void testLongestPalindrome_1() throws Exception {
        LongestPalindromicSubstring sub = new LongestPalindromicSubstring();
        String actual = sub.longestPalindrome("babad");
        assertEquals("bab",actual);
    }

    @Test
    public void testLongestPalindrome_2() throws Exception {
        LongestPalindromicSubstring sub = new LongestPalindromicSubstring();
        String actual = sub.longestPalindrome("bb");
        assertEquals("bb",actual);
    }
    @Test
    public void testLongestPalindrome_3() throws Exception {
        LongestPalindromicSubstring sub = new LongestPalindromicSubstring();
        String actual = sub.longestPalindrome("b");
        assertEquals("b",actual);
    }
    @Test
    public void testLongestPalindrome_4() throws Exception {
        LongestPalindromicSubstring sub = new LongestPalindromicSubstring();
        String actual = sub.longestPalindrome("abcda");
        assertEquals("a",actual);
    }
}