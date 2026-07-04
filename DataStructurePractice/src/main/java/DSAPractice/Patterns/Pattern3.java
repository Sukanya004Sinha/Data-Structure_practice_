package DSAPractice.Patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total_num_of_lines = n;
        int curr_numof_line = 1;
        int spaces = n-1;
        int stars = 1;
        while (curr_numof_line<=total_num_of_lines){
            for (int i = 1;i<=spaces;i++){
                System.out.print("  ");
            }

            for (int i = 1;i<=stars;i++){
                System.out.print("* ");
            }
            System.out.println();
            spaces--;
            stars++;
            curr_numof_line++;
        }
        }
    }