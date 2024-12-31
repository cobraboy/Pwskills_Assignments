package M62_Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q3 {
    public static void permuteUnique(int[] nums, List<Integer> temp, boolean[] visited, List<List<Integer>> result) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])) continue;
            visited[i] = true;
            temp.add(nums[i]);
            permuteUnique(nums, temp, visited, result);
            temp.remove(temp.size() - 1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        permuteUnique(nums, new ArrayList<>(), new boolean[nums.length], result);
        System.out.println(result);
    }
}
