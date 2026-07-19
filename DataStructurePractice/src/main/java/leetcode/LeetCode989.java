package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeetCode989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k:");
        int k = sc.nextInt();

        System.out.println(addToArrayForm(arr, k));


    }
        public static List<Integer> addToArrayForm(int[] arr1, int k) {
        List<Integer> ans = new ArrayList<>();
        int i = arr1.length - 1;
        int carry = 0;
        while (i >= 0 || k !=0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += arr1[i];

                i--;
            }

            if (k > 0) {
                sum += k%10;
                k=k/10;
            }

            int lastDigit = sum % 10;
            ans.add(0, lastDigit);
            carry = sum / 10;


        }
        return ans;


    }
}
