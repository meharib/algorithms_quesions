import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Mehari on 11/20/18.
 */
public class TreeUtil {
    public static TreeNode buildTree() {
        /*
           10
         /  \
        6   15
       /\  / \
      4 8 12 16
        */
        TreeNode ten = new TreeNode(10);
        TreeNode six = new TreeNode(6);
        TreeNode fifteen = new TreeNode(15);
        TreeNode eight = new TreeNode(8);
        TreeNode four = new TreeNode(4);
        TreeNode twelve = new TreeNode(12);
        TreeNode sixteen = new TreeNode(16);

        ten.left = six;
        ten.right = fifteen;
        six.left = four;
        six.right = eight;
        fifteen.left = twelve;
        fifteen.right = sixteen;
        return ten;
    }

    public static TreeNode buildSmallTree() {
        TreeNode fifteen = new TreeNode(15);
        TreeNode twelve = new TreeNode(12);
        TreeNode sixteen = new TreeNode(16);
        fifteen.left = twelve;
        fifteen.right = sixteen;
        return fifteen;
    }

    /*
    -10
   / \
  9  20
    /  \
   15   7

    */
    public static TreeNode buildTree2(){
        TreeNode minusTen = new TreeNode(-10);
        TreeNode nine = new TreeNode(9);
        TreeNode twenty = new TreeNode(20);
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);

        minusTen.left=nine;
        minusTen.right=twenty;
        twenty.left=fifteen;
        fifteen.right=seven;
        return minusTen;
    }

    public static TreeNode buildTree(String[] input) {
        if(input==null) return null;
        int i=0;
        TreeNode root = parseNode(input[i++]);
        Queue<TreeNode> q  = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty() && i< input.length){
            TreeNode node = q.remove();
            node.left = parseNode(input[i++]);
            node.right = parseNode(input[i++]);
            if(node.left!=null) q.add(node.left);
            if(node.right!=null) q.add(node.right);
        }
        return root;
    }
    private static TreeNode parseNode(String val){
        if(val==null || val.equals("n")) return null;
        return new TreeNode(Integer.valueOf(val));
    }


}
