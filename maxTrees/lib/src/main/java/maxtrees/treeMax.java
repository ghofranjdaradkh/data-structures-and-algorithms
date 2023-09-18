package maxtrees;

import java.util.ArrayList;
import java.util.List;

public class treeMax {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public treeMax() {
        this.root = null;
    }

    public int findMaximumValue() {
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }
        return findMaximumValue(root);
    }

    private int findMaximumValue(Node maxNode) {
        int maxValue = maxNode.data;

        if (maxNode.left != null) {
            int leftMax = findMaximumValue(maxNode.left);
            maxValue = Math.max(maxValue, leftMax);
        }

        if (maxNode.right != null) {
            int rightMax = findMaximumValue(maxNode.right);
            maxValue = Math.max(maxValue, rightMax);
        }

        return maxValue;
    }


    public void add(int value) {

        root = addNodeTree(root, value);

    }



    private Node addNodeTree(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.data) {
            current.left = addNodeTree(current.left, value);
        } else if (value > current.data) {
            current.right = addNodeTree(current.right, value);
        }

        return current;
    }



}

