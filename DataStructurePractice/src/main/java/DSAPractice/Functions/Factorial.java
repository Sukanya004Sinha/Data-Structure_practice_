package DSAPractice.Functions;

import java.util.Scanner;

public class Factorial {
    public static int findFactorial(int num) {
        int res = 1;
        for (int i = 1; i <= num; i++) {
            res = res * i;
        }
        return res;
    }
    public static int findNcR(int n, int r) {
       int nFact = findFactorial(n);
        int rFact = findFactorial(r);
        int factNR =  findFactorial(n-r);
        int NCR = nFact / (rFact* factNR);
        return NCR;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int res = findNcR(n, r);
        System.out.println("Result is " + res);

    }
}




