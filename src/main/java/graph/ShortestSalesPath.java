package graph;

/**
 * Created by Mehari on 8/1/18.
 */
public class ShortestSalesPath {
    static class Node {
        int cost;
        Node[] children;
        Node parent;

        Node(int cost) {
            this.cost = cost;
            children = null;
            parent = null;
        }
    }

    static int getCheapestCost(Node rootNode){
        if(rootNode.children==null){
            return rootNode.cost;
        }else{
            int minCost = Integer.MAX_VALUE;
            for(Node child :rootNode.children){
                int tempCost = getCheapestCost(child);
                if(tempCost<minCost) minCost=tempCost;
            }
            return minCost + rootNode.cost;
        }

    }

    public static void main(String[] args){
        Node root = new Node(0);
        Node zero = new Node(0);
        Node one = new Node(1);
        Node one_2 = new Node(1);
        Node one_3 = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node five_2 = new Node(5);
        Node six = new Node(6);
        Node ten = new Node(10);

        //root node
        five.parent=root;
        three.parent=root;
        six.parent=root;
        root.children = new Node[]{five,three,six};

        //five
        four.parent=five;
        five.children=new Node[]{four};

        //three
        two.parent=three;
        zero.parent=three;
        three.children=new Node[]{two,zero};

        //six
        one.parent=six;
        five_2.parent=six;
        six.children=new Node[]{one,five_2};

        //two
        one_2.parent=two;
        two.children=new Node[]{one_2};

        //zero
        ten.parent=zero;
        zero.children=new Node[]{ten};

        //one two
        one_3.parent=one_2;
        one_2.children=new Node[]{one_3};

        //expected 7
        System.out.println(getCheapestCost(root));
    }
}
