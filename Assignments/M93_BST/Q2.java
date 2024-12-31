package M93_BST;

import java.util.*;

public class Q2 {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static int kthLargest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            while (root != null) {
                stack.push(root);
                root = root.right;
            }
            root = stack.pop();
            if (--k == 0) return root.val;
            root = root.left;
        }
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
        System.out.println(kthLargest(root, 2));
    }
}
