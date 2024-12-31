package M62_Backtracking;

public class Q4 {
    public static boolean subsetProduct(int[] arr, int target, int index, int product) {
        if (product == target) return true;
        if (index == arr.length || product > target) return false;
        return subsetProduct(arr, target, index + 1, product * arr[index]) ||
               subsetProduct(arr, target, index + 1, product);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 4};
        int target = 16;
        System.out.println(subsetProduct(arr, target, 0, 1) ? "YES" : "NO");
    }
}
