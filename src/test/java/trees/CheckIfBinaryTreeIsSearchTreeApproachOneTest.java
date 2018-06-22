package trees;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 6/21/18.
 */
public class CheckIfBinaryTreeIsSearchTreeApproachOneTest {

    @Test
    public void testExplore() throws Exception {
        Node root = new Node(5);
        Node three= new Node(3);
        Node two= new Node(2);
        Node six= new Node(6);
        Node eight= new Node(8);

        eight.left=three;
        two.right=six;
        root.left=two;
        root.right=eight;

        assertFalse(CheckIfBinaryTreeIsSearchTreeApproachOne.explore(root));
        assertFalse(CheckIfBinaryTreeIsSearchTreeApproachOne.explore2(root));
    }

}