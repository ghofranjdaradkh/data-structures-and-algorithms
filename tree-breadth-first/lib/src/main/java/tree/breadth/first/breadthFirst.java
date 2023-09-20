package tree.breadth.first;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class breadthFirst {
    static List<Integer> breadthFirstMethod(Node root) {
        List<Integer> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            result.add(temp.data);
            System.out.print(temp.data + " ");


            if (temp.left != null) {
                queue.add(temp.left);
            }


            if (temp.right != null) {
                queue.add(temp.right);
            }
        }

        return result;
    }

}
class Node {
    int data;
Node left;
Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right=null;
    }
}
