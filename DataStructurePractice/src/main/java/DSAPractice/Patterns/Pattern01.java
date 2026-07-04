package DSAPractice.Patterns;

import java.util.Scanner;

public class Pattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total_number_of_lines = n;
        int current_number_of_lines = 1;
        int stars = 1;
        while(current_number_of_lines<=total_number_of_lines){

            for(int i = 1;i<=stars;i++){
                System.out.print("* ");
            }
            System.out.println();
            stars++;
            current_number_of_lines++;
        }
    }
}