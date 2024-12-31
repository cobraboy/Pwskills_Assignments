package M93_BST;

public class Q5 {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            } else if (p.val > root.val && q.val > root.val) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
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
        TreeNode p = new TreeNode(10);
        TreeNode q = new TreeNode(20);
        TreeNode result = lowestCommonAncestor(root, p, q);
        System.out.println(result != null ? result.val : "No Common Ancestor");
    }
}
