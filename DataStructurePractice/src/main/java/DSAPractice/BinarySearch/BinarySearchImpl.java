package DSAPractice.BinarySearch;

public class BinarySearchImpl {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 10, 11, 14};
        int tar = 10;
        System.out.println(target(arr, tar));
    }

    public static int target(int[] arr, int tar) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == tar) {
                return mid;
            } else if (arr[mid] > tar) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return -1;

    }
}

