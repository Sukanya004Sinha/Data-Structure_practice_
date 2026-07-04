package DSAPractice.Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int totalno_of_lines = n;
        int starts = 1;
        int spaces = 2 * n - 3;
        int current_no_of_line = 1;

        while (current_no_of_line <= totalno_of_lines) {

            // Left stars
            for (int i = 1; i <= starts; i++) {
                System.out.print("* ");
            }

            // Middle spaces
            for (int i = 1; i <= spaces; i++) {
                System.out.print("  ");
            }


            // Right stars
            if (current_no_of_line == totalno_of_lines) {
                for (int i = 1; i <starts; i++) {   // print one less star on left hand side
                    System.out.print("* ");
                }
            } else {
                for (int i = 1; i <= starts; i++) {
                    System.out.print("* ");
                }
            }
            starts++;
            spaces -= 2;

            System.out.println();
            current_no_of_line++;
        }
    }
}