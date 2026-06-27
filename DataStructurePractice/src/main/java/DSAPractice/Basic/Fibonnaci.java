package DSAPractice.Basic;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Nth term of fibonacci is 0");
            return;
        }

        if (n == 1) {
            System.out.println("Nth term of fibonacci is 1");
            return;
        }

        int firstTerm = 0;
        int secondTerm = 1;
        for (int i = 2; i <=n; i++) {
            int currTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = currTerm;

        }
        System.out.println("Nth term of fibonacci is" + firstTerm);
    }
}
