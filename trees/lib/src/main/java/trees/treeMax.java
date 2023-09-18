package trees;


public class treeMax {
    private TreeNode root;

    public treeMax() {
        this.root = null;
    }

    public TreeNode getRoot() {
        return root;
    }

    public int findMaximumValue() {
        if (root == null) {
            throw new IllegalStateException("Tree is empty");
        }
        return findMaximumValue(root);
    }

    private int findMaximumValue(TreeNode node) {
        int maxValue = node.data;

        if (node.left != null) {
            int leftMax = findMaximumValue(node.left);
            maxValue = Math.max(maxValue, leftMax);
        }

        if (node.right != null) {
            int rightMax = findMaximumValue(node.right);
            maxValue = Math.max(maxValue, rightMax);
        }

        return maxValue;
    }
    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }




}
