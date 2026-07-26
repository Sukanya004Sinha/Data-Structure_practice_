package DSAPractice.TwoDArray;

import java.util.Scanner;

public class SpiralTrversals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        printSpiral(arr);
    }

    private static void printSpiral(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int sc =0;
        int sr = 0;
        int er = n-1; // ending row
        int ec = m-1; // ending col

        while(sc<=ec && sr<=er){
            //left wall
            for(int col = sc, row =sr;row<=er;row++){
                System.out.print(arr[row][col] + " ,");

            }
            sc++;
            for(int row =er,col=sc; col<=ec; col++){
                System.out.print(arr[row][col] + ",");

            }
            er--;
            //right wall
            for(int col= ec,row =er; row>=sr; row--){
                System.out.print(arr[row][col] + " ,");

            }
            ec--;

            // top
            for (int row=sr,col=ec;col>=sc; col--){
                System.out.print(arr[row][col] + " ,");


            }
            sr++;

        }
    }
}
