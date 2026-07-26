package DSAPractice.BinarySearch;

import java.util.Scanner;

public class FloorAndCeil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int tar = sc.nextInt();
        ceilAndFloor(arr, tar);
    }

    public static void ceilAndFloor(int[] arr, int tar) {
        int left = 0;
        int right = arr.length - 1;
        int floor = -1;
        int ceil = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == tar) {
               floor= arr[mid];
               ceil= arr[mid];
               break;

            } else if (arr[mid] > tar) {
                ceil= arr[mid];
                right = mid - 1;
            } else {
               floor=arr[mid];
                left = mid + 1;
            }


        }

        System.out.println(ceil);
        System.out.println(floor);

    }
}
