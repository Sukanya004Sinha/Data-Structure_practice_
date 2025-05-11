package Recursion;

import java.util.ArrayList;

public class FindElement {
    static boolean findElem(int[] arr, int index, int target) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || findElem(arr, index + 1, target);
    }

    static int findElement(int[] arr, int index, int target) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findElement(arr, index + 1, target);
        }
    }

    static int lastElement(int[] arr, int index, int target){
        if(index == -1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return lastElement(arr, index - 1, target);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
   private  static void findAllIndex(int[] arr, int index, int target) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, index + 1, target);

    }



    public static void main (String[] args){
        int[] arr = {1,2, 6,8,89,9};
       System.out.println(findElem(arr, 0, 9));
       System.out.println(findElement(arr, 0 , 89));
        System.out.println(lastElement(arr, 0 , 89));
       findAllIndex(arr, 0, 4);
       System.out.println(list);
    }
}
