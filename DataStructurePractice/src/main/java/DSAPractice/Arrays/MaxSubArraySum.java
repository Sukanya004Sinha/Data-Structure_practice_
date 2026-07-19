package DSAPractice.Arrays;

import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        maxSubArraySumSIEI(arr);
    }

    public static int maxSubArraySum(int[] arr) {
        int csum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            csum += arr[i];
            maxSum = Math.max(csum, maxSum);
            if (csum < 0) {
                csum = 0;
            }
        }
        return maxSum;
    }

    public static int maxSubArraySumSIEI(int[] arr) {
        int cSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int maxsi = -1;
        int maxEi = -1;
        int cStart = 0;
        for (int i = 0; i < arr.length; i++) {
            cSum += arr[i];
            if (cSum > maxSum) {
                maxSum = cSum;
                maxsi = cStart;
                maxEi= i;
                if (cSum < 0) {
                    cSum = 0;
                    cStart = i + 1;
                }
            }
        }
        System.out.println("Maximum Sum = " + maxSum);
        System.out.println("Start Index = " + maxsi);
        System.out.println("End Index = " + maxEi);
        System.out.print("Maximum Subarray = ");
            return maxSum;
        }
    }