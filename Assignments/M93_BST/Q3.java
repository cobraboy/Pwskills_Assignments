package M93_BST;

import java.util.*;

public class Q3 {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean findPair(TreeNode root, int sum) {
        Set<Integer> set = new HashSet<>();
        return find(root, sum, set);
    }

    private static boolean find(TreeNode root, int sum, Set<Integer> set) {
        if (root == null) return false;
        if (set.contains(sum - root.val)) return true;
        set.add(root.val);
        return find(root.left, sum, set) || find(root.right, sum, set);
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
        System.out.println(findPair(root, 14));
    }
}
