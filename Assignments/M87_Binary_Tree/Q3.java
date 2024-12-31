package M87_Binary_Tree;

import java.util.*;

public class Q3 {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static List<Integer> reverseLevelOrder(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            stack.push(node.val);
            if (node.right != null) queue.offer(node.right);
            if (node.left != null) queue.offer(node.left);
        }

        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        return result;
    }
}
