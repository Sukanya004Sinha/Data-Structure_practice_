package DSARevsion.Array;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
       // reverse(arr);
        reverse1(arr);
        for(int rev : arr){
            System.out.println(rev);
        }

    }
    public static void reverse(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            swap(arr, left, right);
            left++;
            right--;
        }


    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right]= temp;
    }

    public static void reverse1(int[] arr){
        int n = arr.length;
        for(int i =0;i< arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = temp;

        }
    }
}
