package trees;

/**
 * Created by Mehari on 7/15/18.
 */
public class LargestSmallerBSTKey {
    public static int findLargestSmallerKey(Node root, int num) {
        // your code goes here
        return findSmallest(root, num);
    }

    private static int findSmallest(Node node, int num) {
        //if node is null it means we have finished searching
        if (node == null) {
            return -1;
        }
        // if the current value is larger we look on the left side
        if (node.data >= num) {
            return findSmallest(node.left, num);
        //if the current value is smaller and the next value is null or larger we return the current value
        } else if (node.right == null || node.right.data > num) {
            return node.data;
         //otherwise we look for a higer value
        } else {
            return findSmallest(node.right, num);
        }
    }
}
