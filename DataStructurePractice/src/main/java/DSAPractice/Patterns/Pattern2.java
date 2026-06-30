package DSAPractice.Patterns;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total_num_of_lines = n;
        int curr_numof_line = 1;
        int starts = n;
        while (curr_numof_line <= total_num_of_lines) {

            for (int i = 1; i <= starts; i++) {
                System.out.print("* ");
            }

            System.out.println();
            starts--;

            curr_numof_line++;
        }
    }
}
