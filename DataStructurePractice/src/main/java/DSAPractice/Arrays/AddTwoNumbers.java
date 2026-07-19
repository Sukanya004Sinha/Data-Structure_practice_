package DSAPractice.Arrays;

import java.util.Scanner;

public class AddTwoNumbers {
    public static int[] add(int[] arr1, int[] arr2) {
        int max = Math.max(arr1.length, arr2.length);
        int[] res = new int[max + 1];
        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = res.length - 1;
        while (k >= 0) {
            int cSum = 0;
            if (i >= 0) {
                cSum += arr1[i];
            }
            if (j >= 0) {
                cSum += arr2[j];
            }
            cSum += carry;
            if (cSum > 9) {
                cSum = cSum % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            res[k] = cSum;
            i--;
            j--;
            k--;
        }
        return res;
    }
    public static void printArray(int[] res){
        for (int i =0;i<res.length;i++){
            if(i ==0&& res[i]==0) continue;
            System.out.print(res[i] + ",");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i =0;i< arr1.length;i++){
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i =0;i< arr2.length;i++){
            arr2[i] = sc.nextInt();
        }
        int[] res =     add(arr1, arr2);
        printArray(res);


    }
}
