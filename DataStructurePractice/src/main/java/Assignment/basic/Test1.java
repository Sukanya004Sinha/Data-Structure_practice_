package Assignment.basic;
//    n=5
//
//            1 2 3 4 5
//            11 12 13 14 15
//            21 22 23 24 25
//            16 17 18 19 20
//            6 7 8 9 10

import java.util.Scanner;

/**
 * N=4
 *N=4
 *
 * 1 2 3 4
 * 9 10 11 12
 * 13 14 15 16
 * 5 6 7 8
 */

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i += 2) {
            for (int j = 0; j < n; j++) {
                int output = (i * n) + j + 1;
                System.out.print(output + " ");
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            if (i % 2 != 0) {
                for (int j = 0; j < n; j++) {
                    int output = (i * n) + j + 1;
                    System.out.print(output + " ");
                }
                System.out.println();
            }


        }


    }
}
