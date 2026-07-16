package DSAPractice.Arrays;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =new int [n];
        for (int i= 0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        subArray(arr);

    }
    public  static void subArray(int[] arr){
        for(int si = 0; si< arr.length ;si++){
            for(int ei = si;ei< arr.length;ei++){
                for (int k = si;k<=ei;k++){
                    System.out.print(arr[k] + "");
                }
                System.out.println();
            }
        }
    }
}
