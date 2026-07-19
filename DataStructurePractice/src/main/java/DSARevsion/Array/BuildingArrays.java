package DSARevsion.Array;

import java.util.Scanner;

public class BuildingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        buildArr(arr);

    }
    public static void buildArr(int[] arr){
        int total_no_of_lines = max(arr);
        int curr_no_of_lines = total_no_of_lines;
        while(curr_no_of_lines>0){
            for (int i = 0; i < arr.length; i++) {
                int ele = arr[i];
                if(ele>=curr_no_of_lines){
                    System.out.print("* \t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
            curr_no_of_lines--;
        }
    }

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if (ele > max) {
                max = ele;
            }

        }
        return max;
    }
}

