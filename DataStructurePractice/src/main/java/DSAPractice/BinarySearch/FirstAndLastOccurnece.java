package DSAPractice.BinarySearch;

import java.util.Scanner;

public class FirstAndLastOccurnece {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(firstOccurnce(arr, x));
        System.out.println(lastOccurence(arr,x));

    }
    public static int firstOccurnce(int[] arr, int tar){
        int left = 0;
        int right = arr.length-1;
        int first = -1;
        while(left<=right){
            int mid =(left+right)/2;
            if(arr[mid]==tar){
                first= mid;
                right= arr[mid-1];
            }
            else if(arr[mid]<tar){
              left =   arr[mid+1];
            }
            else{
               right= arr[mid-1];
            }

        }
        return first;
    }
    public static int lastOccurence(int[] arr,int tar){
        int left = 0;
        int right = arr.length-1;
        int last =-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (arr[mid]==tar){
                last = mid;
                left = arr[mid+1];

            }
            else if(arr[mid]<tar){
                left =   arr[mid+1];
            }
            else {
                right =  arr[mid-1];
            }


        }

        return  last;
    }
}
