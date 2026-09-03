package DSAPractice.Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));

    }

    public static int factorial(int n) {
        int ans = 0;
        if (n == 0) {
            return 1;
        }
        int factn = factorial(n - 1);
        ans = n * factn;

        return ans;
    }

}

