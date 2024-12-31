package M93_BST;

public class Q1 {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode search(TreeNode root, int key) {
        while (root != null && root.val != key) {
            root = key < root.val ? root.left : root.right;
        }
        return root;
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
        TreeNode result = search(root, 25);
        System.out.println(result != null ? "Found: " + result.val : "Not Found");
    }
}
