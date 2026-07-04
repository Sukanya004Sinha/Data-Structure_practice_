package DSAPractice.Patterns;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total_num_of_lines = 2 * n + 1;
        int curr_numof_line = 1;
        int spaces = n;
        int star = 1;
        while (curr_numof_line <= total_num_of_lines) {
            for (int i = 1; i <=spaces; i++) {
                System.out.print("  ");
            }
            for (int i = 1; i <=star; i++) {
                System.out.print("* ");
            }
            if (curr_numof_line <= n) {
                spaces--;
                star += 2;
            } else {
                spaces++;
                star -= 2;
            }
            System.out.println();

            curr_numof_line++;
        }
    }
}

