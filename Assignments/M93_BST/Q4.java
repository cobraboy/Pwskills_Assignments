package M93_BST;

public class Q4 {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode inorderPredecessor(TreeNode root, TreeNode p) {
        TreeNode predecessor = null;
        while (root != null) {
            if (p.val <= root.val) {
                root = root.left;
            } else {
                predecessor = root;
                root = root.right;
            }
        }
        return predecessor;
    }

    public static TreeNode createSampleBST() {
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(12);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = createSampleBST();
        TreeNode node = new TreeNode(20);
        TreeNode result = inorderPredecessor(root, node);
        System.out.println(result != null ? result.val : "No Predecessor");
    }
}
