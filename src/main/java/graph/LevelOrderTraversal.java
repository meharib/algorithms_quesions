package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Mehari on 7/18/18.
 */
public class LevelOrderTraversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
            left=null;
            right=null;
        }
    }

    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        Queue<Integer> levelQueue = new LinkedList<Integer>();
        //no need to keep track of the visited once because it is a tree therefore no cycles
        q.add(A);
        levelQueue.add(0);
        while(!q.isEmpty()){
            TreeNode v = q.remove();
            int level = levelQueue.remove();
            if(result.size()==level){
                result.add(new ArrayList<Integer>());
            }
            ArrayList<Integer> nodes = result.get(level);
            nodes.add(v.val);
            //add children to the queue
            if(v.left!=null){
                q.add(v.left);
                levelQueue.add(level+1);
            }
            if(v.right!=null){
                q.add(v.right);
                levelQueue.add(level+1);
            }
        }
        return result;
    }

    public static void main(String[] args){
        /*
                3
               / \
              9  20
                /  \
               15   7
            return its level order traversal as:

            [
              [3],
              [9,20],
              [15,7]
            ]
        * */
        TreeNode three = new TreeNode(3);
        TreeNode nine = new TreeNode(9);
        TreeNode twenty = new TreeNode(20);
        TreeNode fifteen = new TreeNode(15);
        TreeNode seven = new TreeNode(7);

        twenty.left=fifteen;
        twenty.right=seven;

        three.left=nine;
        three.right=twenty;

        ArrayList<ArrayList<Integer>> result = levelOrder(three);
        for (ArrayList<Integer> integers : result) {
            System.out.println(Arrays.toString(integers.toArray()));
        }
    }

}
