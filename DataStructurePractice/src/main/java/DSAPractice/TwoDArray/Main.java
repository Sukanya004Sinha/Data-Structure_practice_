package DSAPractice.TwoDArray;

import java.util.Random;
import java.util.Scanner;

class Main{
    public static void fillRandomValues(int[][] arr) {
        Random random = new Random();
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[0].length;j++){
                arr[i][j]= random.nextInt(100);
            }

        }

    }

    public static void main(String[] args) {
        int[][] arr = new int[5][3];
        fillRandomValues(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
