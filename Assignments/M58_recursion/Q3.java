package M58_recursion;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {13, 1, -3, 22, 5};
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        System.out.println(max);
    }
}
