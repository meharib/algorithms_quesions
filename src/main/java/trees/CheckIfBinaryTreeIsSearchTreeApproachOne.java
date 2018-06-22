package trees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mehari on 6/21/18.
 */
public class CheckIfBinaryTreeIsSearchTreeApproachOne {

    //the left tree should have a maximum upper bound node the current node value
    //the right tree should have a minimum lower bound of the current node values
    public static boolean explore(Node n){
        return minMax(n,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private static boolean minMax(Node node,int lower, int upper ){
        if(node==null){
            return true;
        }
        if(lower<=node.data && upper>=node.data && minMax(node.left,lower,node.data) && minMax(node.right,node.data,upper)){
            return true;
        }
        return false;

    }

    //approach to do inorder traverse and store the value in an array.
    //if the elements in the array are increasing order then return true;
    public static boolean explore2(Node node){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        inorder(node,arr);
        int min = arr.get(0);
        boolean isBinary=true;
        for(int i=1; i<arr.size(); i++){
            if(arr.get(i)>=min){
                min=arr.get(i);
            }else{
                isBinary=false;
                break;
            }
        }
        return isBinary;

    }

    private static void inorder(Node node, List<Integer> arr){
        if(node.left!=null){
            inorder(node.left,arr);
        }
        arr.add(node.data);
        if(node.right!=null){
            inorder(node.right,arr);
        }

    }
}
