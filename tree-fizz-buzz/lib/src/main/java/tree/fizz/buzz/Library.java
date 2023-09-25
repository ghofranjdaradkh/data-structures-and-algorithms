package tree.fizz.buzz;

import java.util.LinkedList;
import java.util.List;

public class Library {
    public static void main(String[] args) {
        treeFizzBuzz tree = new treeFizzBuzz();
        tree.root = tree.new Node(10);
        tree.root.child = tree.new Node(15);
        tree.root.child.child = tree.new Node(9);
        tree.root.child.child.child = tree.new Node(7);
        tree.root.child.child.child.child = tree.new Node(30);

        List<String> result = tree.fizzBuzzTree();
        for (String value : result) {
            System.out.println(value);
        }
    }
}
