package trees;

/**
 * Created by Mehari on 6/19/18.
 */
public class Node {
    public int data;
    public Node left;
    public Node right;
    public Node(int data){
        this.data=data;
    }

    public void insert(int value){
        if(value<=data){
            insertLeft(value);
        }else{
            insertRight(value);
        }
    }

    private void insertLeft(int value) {
        if(this.left==null){
            this.left=new Node(value);
        }else{
            this.left.insert(value);
        }
    }
    private void insertRight(int value) {
        if(this.right==null){
            this.right=new Node(value);
        }else{
            this.right.insert(value);
        }
    }

    public boolean contains(int value){
        if(data==value) return true;
        if(value<data){
            if(this.left==null) return false;
            return this.left.contains(value);
        }else{
            if(this.right==null) return false;
            return this.right.contains(value);
        }
    }

    public void printInOrder(){
        if(this.left!=null){
            this.left.printInOrder();
        }
        System.out.println(data);
        if(this.right!=null){
            this.right.printInOrder();
        }
    }


}
