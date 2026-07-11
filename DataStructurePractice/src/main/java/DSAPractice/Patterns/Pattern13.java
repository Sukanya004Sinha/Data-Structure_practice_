package DSAPractice.Patterns;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total_no_of_lines = 2*n+1;
        int curr_no_of_lines = 1;
        int star = 1;
        int sp = n;
        int stnum=1;
        while (curr_no_of_lines<=total_no_of_lines) {
            for (int i = 1; i <= sp; i++) {
                System.out.print("  ");
            }
            int num = stnum;
            for (int i = 1; i <= star; i++) {
                System.out.print(num + " ");
                if(i<=star/2) {
                    num++;
                }
                else{
                    num--;
                }


            }
            if (curr_no_of_lines <= n) {
                sp--;
                star += 2;
               stnum++;
            } else {
                sp++;
                star -= 2;
                stnum--;
            }


            System.out.println();
            curr_no_of_lines++;

        }

    }
}
