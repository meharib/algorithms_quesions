package trees;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 6/27/18.
 */
public class TrieNodeTest {
    TrieNode trie;


    @Before
    public void setup(){
        trie = new TrieNode();
        String car = "car";
        String cat= "cat";
        String dog = "dog";
        trie.insert(car);
        trie.insert(cat);
        trie.insert(dog);
    }
    @Test
    public void testPrefix() throws Exception {
        assertTrue(trie.hasPrefix("ca"));
        assertTrue(trie.hasPrefix("do"));
        assertFalse(trie.hasPrefix("da"));
        assertFalse(trie.hasPrefix("k"));
    }

    @Test
    public void testHasWord() throws Exception{
        assertTrue(trie.hasWord("cat"));
        assertFalse(trie.hasWord("ca"));
        assertTrue(trie.hasWord("dog"));
        assertFalse(trie.hasWord("d"));
        assertTrue(trie.hasWord("car"));
    }
}