import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 6/2/18.
 */
public class PalindromicIntegerTest {

    @Test
    public void testIsPalindrome_1() throws Exception {
        PalindromicInteger palindromicInteger = new PalindromicInteger();
        assertTrue(palindromicInteger.isPalindrome(121));
    }
    @Test
    public void testIsPalindrome_2() throws Exception {
        PalindromicInteger palindromicInteger = new PalindromicInteger();
        assertFalse(palindromicInteger.isPalindrome(10));
    }
    @Test
    public void testIsPalindrome_3() throws Exception {
        PalindromicInteger palindromicInteger = new PalindromicInteger();
        assertTrue(palindromicInteger.isPalindrome(1));
    }
}