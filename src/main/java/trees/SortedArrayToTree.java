package trees;

/**
 * Created by Mehari on 6/19/18.
 */
public class SortedArrayToTree {
    public static Node convertToTree(int[] input){
        int length=input.length;
        return insert(null,0,length-1,input);
    }

    private static Node insert(Node node, int start, int end, int[] input) {
        if(end==start){
            node.insert(input[start]);
            return node;
        }else if(end-start==1){
            node.insert(input[start]);
            node.insert(input[end]);
        }
        else{
            int middle = (int)Math.floor((end+start) /2.0);
            if(node==null){
                node=new Node(input[middle]);
            }else{
                node.insert(input[middle]);
            }
            //left
            insert(node,start,middle-1,input);
            //right
            insert(node,middle+1,end,input);

        }
        return node;
    }

    public static void main(String[] args){
        Node node = convertToTree(new int[]{1, 2, 3, 4, 5,6,7,8,9});
        node.printInOrder();
    }
}
