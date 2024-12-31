package M78_Greedy_Algo;

import java.util.Arrays;

public class Q1 {
    public static int minSumAfterKModifications(int[] a, int[] b, int k) {
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < k; i++) {
            int index = 0;
            for (int j = 1; j < a.length; j++) {
                if (Math.abs(a[j] * b[j]) > Math.abs(a[index] * b[index])) {
                    index = j;
                }
            }
            a[index] += (b[index] > 0 ? -2 : 2);
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3};
        int[] b = {-2, 3, -5};
        int k = 5;
        System.out.println(minSumAfterKModifications(a, b, k));
    }
}
