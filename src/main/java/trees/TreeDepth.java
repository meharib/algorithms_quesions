package trees;

/**
 * Created by Mehari on 6/20/18.
 */
public class TreeDepth {
    public static int getDepth(Node node){
        if(node==null){
            return -1;
        }
        return Math.max(getDepth(node.left)+1, getDepth(node.right)+1);
    }
}
