package trees;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 6/19/18.
 */
public class NodeTest {

    @Test
    public void testInsert() throws Exception {
        int[] input = {3,5,2,4,1,6,3};
        Node tree = new Node(input[0]);
        for(int i=1; i<input.length; i++){
            tree.insert(input[i]);
        }
        tree.printInOrder();
        assertTrue(tree.contains(6));
        assertFalse(tree.contains(9));

    }

}