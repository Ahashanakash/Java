import java.util.*;
public class Factorial {
    public static long fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        else {
            long ans = 1;
            for (int i = 2; i <= n; i++) {
                ans = ans * i;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long result = fact(n);
        System.out.println("Factorial of " + n + " is: " + result);
    }
}