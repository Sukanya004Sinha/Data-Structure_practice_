package DSAPractice.Arrays;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = 5;

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {

            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }


        print(arr);

    }

    public static void print(int[] arr) {
        for (int i = 0; i <arr.length; i++) {
            int ele = arr[i];
            System.out.println(ele);
        }
    }
}