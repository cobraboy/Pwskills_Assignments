package M87_Binary_Tree;

import java.util.*;

public class Q2 {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean isCompleteBinaryTree(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = false;

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                flag = true;
            } else {
                if (flag) return false;
                queue.offer(node.left);
                queue.offer(node.right);
            }
        }
        return true;
    }
}
