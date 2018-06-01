import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 5/31/18.
 */
public class ShortestPalindromeTest {

    @Test
    public void testShortestPalindrome_1() throws Exception {
        ShortestPalindrome palindrome = new ShortestPalindrome();
        String actual = palindrome.shortestPalindrome("a");
        assertEquals("a",actual);
    }
    @Test
    public void testShortestPalindrome_2() throws Exception {
        ShortestPalindrome palindrome = new ShortestPalindrome();
        String actual = palindrome.shortestPalindrome("aabbc");
        assertEquals("cbbaabbc",actual);
    }
    @Test
    public void testShortestPalindrome_3() throws Exception {
        ShortestPalindrome palindrome = new ShortestPalindrome();
        String actual = palindrome.shortestPalindrome("aacecaaa");
        assertEquals("aaacecaaa",actual);
    }
    @Test
    public void testShortestPalindrome_4() throws Exception {
        ShortestPalindrome palindrome = new ShortestPalindrome();
        String actual = palindrome.shortestPalindrome("abcd");
        assertEquals("dcbabcd",actual);
    }
}