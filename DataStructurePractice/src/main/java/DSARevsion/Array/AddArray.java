package DSARevsion.Array;

import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] res = add(arr1, arr2);
        print(res);

    }

    private static int[] add(int[] arr1, int[] arr2) {
        int max = Math.max(arr1.length, arr2.length);
        int[] res = new int[max + 1];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = res.length - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += arr1[i];
                i--;
            }

            if (j >= 0) {
                sum += arr2[j];
                j--;
            }

            int lastDigit = sum % 10;
            res[k] = lastDigit;
            carry = sum / 10;


            k--;

        }
        return res;


    }

    public static void print(int[] arr) {
        int start = 0;
        while (start < arr.length - 1 && arr[start] == 0) {
            start++;
        }


        // leading zero remove karne ke liye
        if (arr[0] == 0) {
            start = 1;
        }

        for (int i = start; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

