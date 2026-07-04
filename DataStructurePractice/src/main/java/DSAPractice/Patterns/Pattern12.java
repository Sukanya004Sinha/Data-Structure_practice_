package DSAPractice.Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total_no_of_lines = n;
        int curr_no_of_lines = 1;
        int star =1;
        int firstNum = 1;
        int secNum = 1;
        while (curr_no_of_lines<=total_no_of_lines) {
            for (int i =1;i<=star;i++){
                System.out.print(firstNum + "\t");
                int currN = firstNum+secNum;
                firstNum = secNum;
                secNum = currN;
            }


            System.out.println();
            star++;
            curr_no_of_lines++;
        }

    }
}
