package M62_Backtracking;

import java.util.Arrays;

public class Q1 {
    public static boolean canPartitionKSubsets(int[] arr, int k) {
        int sum = Arrays.stream(arr).sum();
        if (sum % k != 0) return false;
        int target = sum / k;
        boolean[] visited = new boolean[arr.length];
        return backtrack(arr, visited, k, 0, 0, target);
    }

    private static boolean backtrack(int[] arr, boolean[] visited, int k, int start, int currentSum, int target) {
        if (k == 0) return true;
        if (currentSum == target) return backtrack(arr, visited, k - 1, 0, 0, target);
        for (int i = start; i < arr.length; i++) {
            if (!visited[i] && currentSum + arr[i] <= target) {
                visited[i] = true;
                if (backtrack(arr, visited, k, i + 1, currentSum + arr[i], target)) return true;
                visited[i] = false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 2};
        int k = 2;
        System.out.println(canPartitionKSubsets(arr, k));
    }
}
