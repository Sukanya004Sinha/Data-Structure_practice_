package DSAPractice.TwoDArray;

import java.util.Scanner;

public class TwoDArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][]arr = new int [m][n];

                test(arr);
            }

        public static void test(int[][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = i + j;
            }
        }

        //print
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
        }
            System.out.println();
        }
    }

