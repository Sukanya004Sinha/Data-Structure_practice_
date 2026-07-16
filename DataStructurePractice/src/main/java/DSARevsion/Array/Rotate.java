package DSARevsion.Array;

import java.util.Scanner;

public class Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr, 1);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void reverse(int[] arr, int left, int right) {
         while (left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]= temp;
            left++;
            right--;

        }
    }
    public static void rotate(int[] arr, int k){
        int n = arr.length;
        if(k<0){
            k= k+n;
        }
        if(k>0){
            k= k%n;
        }
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);

    }
}
