package trees;

import apple.laf.JRSUIUtils;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Mehari on 6/20/18.
 */
public class TreeDepthTest {

    @Test
    public void testGetDepth() throws Exception {
        Node node = new Node(5);
        Arrays.asList(1,2,3,4,5,6,7,8,9);
        for (Integer integer : Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)) {
            node.insert(integer);
        }
        assertEquals(5, TreeDepth.getDepth(node));

    }
}