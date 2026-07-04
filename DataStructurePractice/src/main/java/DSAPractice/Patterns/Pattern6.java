package DSAPractice.Patterns;
import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total_number_of_lines = 2 * n + 1;
        int current_no_of_lines = 1;
        int star = n + 1;
        int space = 1;

        while (current_no_of_lines <= total_number_of_lines) {
            for (int i = 1; i <= star; i++) {
                System.out.print("*  ");
            }
            for (int i = 1; i <= space; i++) {
                System.out.print("   ");
            }
            for (int i = 1; i <= star; i++) {
                System.out.print("*  ");
            }
            if (current_no_of_lines <= n) {
                star--;
                space+=2;
            } else {
                star ++;
                space-=2;

            }


            System.out.println();
            current_no_of_lines++;
        }
    }
}