package DSAPractice.Arrays;

import java.util.Scanner;

public class SpanOfArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(span(arr));
    }

    public static int span(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            int ele = arr[i];
            if(ele>max){
                max = ele;
            }
            if(ele<min){
                min = ele;
            }

        }
        int span = max-min;
        return span;

}
}