package Assignment.basic;

/**
 *
 * Given an integer array  remove All Occurrences of an Element in an Array.
 *
 * Input: arr[] = [0, 1, 3, 0, 2, 2, 4, 2], ele = 2
 *
 */
public class OccurenceOfElement {
    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 0, 2, 2, 4, 2};
        int ele = 2;
        int k = removeElement(arr, ele);
        for(int i =0;i<k;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static  int removeElement(int[] arr, int ele){
        int k = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!= ele){
                arr[k] = arr[i];
                k++;
                }
            }
        return k;
        }
    }

