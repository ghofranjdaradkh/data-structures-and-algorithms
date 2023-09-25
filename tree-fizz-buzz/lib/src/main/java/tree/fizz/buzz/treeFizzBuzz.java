package tree.fizz.buzz;

import java.util.LinkedList;
import java.util.List;

public class treeFizzBuzz {

     Node root;



    private List<String> list = new LinkedList<>();

    public List<String> fizzBuzzTree() {
        fizzBuzzHelper(root);
        return list;
    }

    private void fizzBuzzHelper(Node node) {
        if (node == null) {
            return;
        }

        int current = node.data;

        if (current % 3 == 0 && current % 5 == 0) {
            list.add("FizzBuzz");
        } else if (current % 3 == 0) {
            list.add("Fizz");
        } else if (current % 5 == 0) {
            list.add("Buzz");
        } else {
            list.add(Integer.toString(current));
        }

        fizzBuzzHelper(node.child);
    }

    public class Node {
        int data;
        Node child;

        public Node(int data) {
            this.data = data;
            this.child = null;
        }
    }


}
