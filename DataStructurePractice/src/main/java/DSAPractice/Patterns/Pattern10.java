package DSAPractice.Patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int total_num_of_lines = n;
        int curr_numof_line = 1;
        int outer_spaces = n / 2;
        int inner_spaces = -1;

        while (curr_numof_line <= total_num_of_lines) {

            // Outer Spaces
            for (int i = 1; i <= outer_spaces; i++) {
                System.out.print("  ");
            }

            // First Star
            System.out.print("* ");

            // Inner Spaces
            for (int i = 1; i <= inner_spaces; i++) {
                System.out.print("  ");
            }

            // Second Star
            if (curr_numof_line != 1 && curr_numof_line != total_num_of_lines) {
                System.out.print("* ");
            }

            if (curr_numof_line <= total_num_of_lines / 2) {
                outer_spaces--;
                inner_spaces += 2;
            } else {
                outer_spaces++;
                inner_spaces -= 2;
            }

            System.out.println();
            curr_numof_line++;
        }
    }
}