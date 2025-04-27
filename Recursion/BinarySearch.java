package Recursion;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {1,3 ,16, 66, 80, 99 };
        int data = 15;
        int result = binarySearch(arr, 0, arr.length-1, data);
        System.out.println(result);

    }
    public static int binarySearch(int [] arr, int low, int high, int target) {
        if(low>high) {
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid] == target) {
            return mid;
        }
        else if( arr[mid]== target){
            return mid;
        }
        else if(arr[mid]>target){
            return binarySearch(arr, low, mid-1, target);
        }
        else {
            return binarySearch(arr, mid+1, high, target);

        }

    }
}
