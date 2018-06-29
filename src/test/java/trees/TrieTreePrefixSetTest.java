package trees;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 6/28/18.
 */
public class TrieTreePrefixSetTest {

    @Test
    public void testIsBadSet_1() throws Exception {
        String[] input = {"aab", "defgab", "abcde", "aabcde", "cedaaa", "bbbbbbbbbb", "jabjjjad"};
        String actual = TrieTreePrefixSet.isBadSet(input);
        assertEquals("aabcde", actual);
    }

    @Test
    public void testIsBadSet_2() throws Exception {
        String[] input = {"aab","aac","aacghgh","aabghgh"};
        String actual = TrieTreePrefixSet.isBadSet(input);
        assertEquals("aacghgh", actual);
    }
}