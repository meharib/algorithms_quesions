package trees;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by Mehari on 6/27/18.
 */
public class TopView {

    public static void topView(Node root) {
        String s = "";
        TreeMap<Integer, Node> m = bfs(root);
        for (Integer i : m.keySet()) {
            s = s + " " + m.get(i).data;
        }
        System.out.println(s.trim());

    }

    private static TreeMap<Integer, Node> bfs(Node n) {
        List<Node> queue = new ArrayList<Node>();
        List<Integer> distance = new ArrayList<Integer>();

        TreeMap<Integer, Node> map = new TreeMap<Integer, Node>();
        queue.add(n);
        distance.add(0);

        while (!queue.isEmpty()) {
            Node node = queue.remove(0);
            int dist = distance.remove(0);
            if (!map.containsKey(dist)) {
                map.put(dist, node);
            }
            if (node.left != null) {
                queue.add(node.left);
                distance.add(dist - 1);
            }
            if (node.right != null) {
                queue.add(node.right);
                distance.add(dist + 1);
            }

        }
        return map;
    }


}
