package DSAPractice.Arrays;

import java.util.Scanner;

public class BuildingArrays {
    public static void buildArr(int[] arr) {

        int total_no_oflines = max(arr);
        int currFloor = total_no_oflines;

        while (currFloor > 0) {

            for (int i = 0; i < arr.length; i++) {

                int ele = arr[i];

                if (ele >= currFloor) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.println();   // Move to the next row
            currFloor--;            // Go to the next lower floor
        }
    }


    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if (ele > max) {
                max = ele;

            }

        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println("no of elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        for(int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
     buildArr(arr);

    }
}
