package DSAPractice.Arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        Rightrotate(arr, k);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void reverse(int[] arr, int i, int j) {

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
        public static void Rightrotate(int[] arr,int k){
                int n = arr.length;
                k = k % n;

                if(k < 0){
                    k = k + n;
                }
            reverse(arr, 0, k - 1);
            reverse(arr, k, arr.length - 1);
            reverse(arr, 0, arr.length - 1);


            }
    public static void leftRotate(int[] arr,int k){
        int n = arr.length;
        k = k % n;

        if(k < 0){
            k = k + n;
        }
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);


    }
}

