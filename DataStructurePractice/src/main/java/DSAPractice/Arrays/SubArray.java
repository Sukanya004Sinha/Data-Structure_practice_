package DSAPractice.Arrays;

import java.util.Map;
import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumSubArray(arr));

    }

    public static void subArray(int[] arr) {
        for (int si = 0; si < arr.length; si++) {
            for (int ei = si; ei < arr.length; ei++) {
                for (int k = si; k <= ei; k++) {
                    System.out.print(arr[k] + "");
                }
                System.out.println();
            }
        }
    }

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        for (int si = 0; si < n; si++) {
            int cSum = 0;
            for (int ei = si; ei < n; ei++) {
                cSum += nums[ei];
                maxSum = Math.max(maxSum, cSum);
            }
        }
        return maxSum;
    }

    public static int maximumSubArray(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int maxsi = -1;
        int maxei = -1;
        for (int si = 0; si < n; si++) {
            int cSum = 0;
            for (int ei = si; ei < n; ei++) {
                cSum += arr[ei];
                if (cSum > maxSum) {
                    maxSum = cSum;
                    maxsi = si;
                    maxei = ei;
                }


            }
        }
            System.out.println("Maximum Sum = " + maxSum);
            System.out.println("Start Index = " + maxsi);
            System.out.println("End Index = " + maxei);
            System.out.print("Maximum Subarray = ");


        return maxSum;

    }
}
