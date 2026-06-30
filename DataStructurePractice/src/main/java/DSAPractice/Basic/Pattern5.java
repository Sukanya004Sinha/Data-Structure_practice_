package DSAPractice.Basic;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total_num_of_lines = 2*n+1;
        int curr_numof_line = 1;
        int starts = 1;
        int spaces = n;
        while (curr_numof_line <= total_num_of_lines) {
            for (int i = 1; i <= spaces; i++) {
                System.out.print("  ");
            }
            for (int i = 1; i <= starts; i++) {
                System.out.print("* ");
            }


            System.out.println();
            if (curr_numof_line <= n) {
                spaces--;
                starts += 2;
            } else {
                spaces++;
                starts -= 2;
            }

            curr_numof_line++;
        }
    }
}


