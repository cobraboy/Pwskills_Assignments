package M58_recursion;

public class Q5 {
    public static boolean isArmstrong(int n) {
        int sum = 0, temp = n, digits = String.valueOf(n).length();
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong(n) ? "Yes" : "No");
    }
}
