package trees;

public class BinarySearchTree extends BinaryTree {
private Node root;
    public Node getRoot() {
        return root;
    }

    public BinarySearchTree()
    {
        this.root = null;
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


    public boolean contains(int value) {
        return containsMethod(root, value);
    }

    private boolean containsMethod(Node current, int value) {
        if (current == null) {
            return false;
        }

        if (current.data == value) {
            return true;
        } else if (current.data > value) {
            return containsMethod(current.left, value);
        } else {
            return containsMethod(current.right, value);
        }
    }
}
