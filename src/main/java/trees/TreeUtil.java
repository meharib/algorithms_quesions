package trees;

/**
 * Created by Mehari on 6/27/18.
 */
public class TreeUtil {
    public static Node buildTree(int[] data){
        Node root =null;
        for(int i : data){
            root=insert(root,i);
        }
        return root;
    }

    private static Node insert(Node n, int data){
        if(n==null){
            n = new Node(data);
        }else{
            if(data<=n.data){
                Node l = insert(n.left, data);
                n.left=l;
            }else{
                Node r = insert(n.right, data);
                n.right=r;
            }
        }
        return n;
    }

}
