package level_2.searching_and_sorting;

import java.util.*;

public class MaximizetheSumOfArray {
    /**
     * Intuition - largest value should be multiplied by largest index
     * and smallest value should be multiplied with smaller index
     * so need to sort the array first in ascending order
     */
    public static int maximize(int[] arr) {
        int overAllSum = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            overAllSum += arr[i] * i;
        }
        return overAllSum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
            int ans = maximize(arr);
            System.out.println(ans);
        }
    }

}
