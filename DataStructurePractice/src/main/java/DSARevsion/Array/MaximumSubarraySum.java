package DSARevsion.Array;

import java.util.Scanner;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println( mxSubArray(arr));

    }

    public static int mxSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int si = 0; si < arr.length; si++) {
            for (int ei = si; ei < arr.length; ei++) {
                int currSum = 0;
                for (int k = si; k <= ei; k++) {
                   currSum+= arr[k];

                }
               maxSum= Math.max(maxSum, currSum);

                }

            }
        return maxSum;
        }
    }


