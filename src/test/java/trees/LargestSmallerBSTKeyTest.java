package trees;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 7/15/18.
 */
public class LargestSmallerBSTKeyTest {

    @Test
    public void testFindLargestSmallerKey() throws Exception {
        Node node = new Node(20);
        ;
        Arrays.asList(9, 25, 5, 12, 11, 14).forEach(node::insert);
        int actual = LargestSmallerBSTKey.findLargestSmallerKey(node, 17);
        assertEquals(14,actual);
    }
}