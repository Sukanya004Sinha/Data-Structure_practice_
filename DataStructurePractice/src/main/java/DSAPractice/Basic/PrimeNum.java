package DSAPractice.Basic;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //  prime(n);
        primeNum(n);

    }

    //Brute Force
    public static void prime(int n) {
        int factCount = 0;
        for (int div = 1; div <= n; div++) {
            if (n % div == 0) {
                factCount++;
            }
        }
        if (factCount == 2) {
            System.out.println("num is prime");
        } else {
            System.out.println("no is not prime");
        }
    }

    //optimized
    public static void primeNum(int n) {
        boolean isprime = true;
        for (int div = 2; div * div <= n; div++) {
            if (n % div == 0) {
                break;
            }
        }
        if (isprime == true) {
            System.out.println("num is prime");
        } else {
            System.out.println("num is not prime");
        }
    }
}