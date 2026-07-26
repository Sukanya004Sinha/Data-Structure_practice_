package DSAPractice.TwoDArray;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            int[] anotherArray = arr[i];

            for (int j = 0; j < arr[0].length; j++) {
                int ele = anotherArray[j];
                System.out.print("i:" + i + ",j:" + j + ", ele value:" + ele + "), ");

            }
            System.out.println();
        }

    }
}
