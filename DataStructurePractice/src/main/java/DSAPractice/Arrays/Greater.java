package DSAPractice.Arrays;

import java.util.Scanner;

public class Greater {
    public static int greater(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if (ele > x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the elements");
        for(int i =0;i< arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value of x: ");
            int x = sc.nextInt();
        System.out.println(greater(arr, x));

        }
    }

