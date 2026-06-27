package DSAPractice.Basic;

import java.util.Scanner;

public class AllPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startingNum = sc.nextInt();
        int endingNum = sc.nextInt();
        for (int i = startingNum; i <= endingNum; i++) {
            if (isPrime(i))
            {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int div = 2; div * div <= n; div++) {
            if (n % div == 0) {
                return false;
            }
        }
        return true;

    }
}
