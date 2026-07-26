package DSAPractice.TwoDArray;

import java.util.Scanner;

public class ExitPointRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
exitPoint(arr);

    }

    public static void exitPoint(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int dir = 0;
        int row = 0;
        int col = 0;
        while (row < n && col < m && row >= 0 && col >= 0) {
            if(arr[row][col]==1) {
                arr[row][col]=0;
                dir = (dir + 1) % 4;
            }
            if (dir == 0) {
                col++;
            } else if (dir == 1) {
                row++;
            } else if (dir == 2) {
                col--;
            } else {
                row--;
            }
            System.out.println(row + " " + col);
        }
        if (row < 0) {
            row++;
        }
        if (col == 0) {
            col++;
        }
        if (row == n) {
            row--;
        }
        if (col == m) {
            col--;
        }
    }
}
