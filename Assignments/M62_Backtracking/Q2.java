package M62_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Q2 {
    public static void permute(int[] arr, List<Integer> temp, boolean[] visited, List<List<Integer>> result) {
        if (temp.size() == arr.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp.add(arr[i]);
                permute(arr, temp, visited, result);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = new ArrayList<>();
        permute(arr, new ArrayList<>(), new boolean[arr.length], result);
        System.out.println(result);
    }
}
