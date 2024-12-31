package M58_recursion;

public class Q2 {
    public static int alternateSum(int n) {
        if (n == 0) return 0;
        return n % 2 == 0 ? -n + alternateSum(n - 1) : n + alternateSum(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(alternateSum(n));
    }
}

