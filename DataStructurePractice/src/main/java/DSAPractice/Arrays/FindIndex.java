package DSAPractice.Arrays;

import java.util.Scanner;

public class FindIndex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Eneter elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target Element");
        int x = sc.nextInt();
        int result = findIndex(arr, x);
        System.out.println(result);
    }

    public static int findIndex(int[] arr, int x) {
        for(int i =0;i< arr.length;i++){
            int ele = arr[i];

            if(ele==x){
                return i;
            }
        }
        return -1;
    }
}