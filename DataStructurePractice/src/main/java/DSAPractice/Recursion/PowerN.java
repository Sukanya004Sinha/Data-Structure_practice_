package DSAPractice.Recursion;

public class PowerN {
    public static void main(String[] args) {
        System.out.println(powerLogN(2, 5));
    }
    public static int powerLogN(int x, int n) {
        if (n == 0) return 1;
        int sans = powerLogN(x, n / 2);
        int xn = sans * sans;
        if (n % 2 == 1) {
            xn = xn * x;
        }
        return xn;
    }
}
