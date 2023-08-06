package level_2.searching_and_sorting;
import java. util.*;

public class l001 {

    public static int binarySearch(int []arr, int si, int ei, int data){
        while(si<=ei){
            int mid = (si+ei)/2;
            if(arr[mid]== data){
                return mid;
            }
            else if(arr[mid]<data){
            si = mid+1;
            }
            else{
                ei = mid-1;
            }
        }
        return -1;
    }
    /***************************************************************/
    public static int firstIndex(int[] arr, int si, int ei, int data){
        while(si<=ei){
            int mid = (si+ei) /2;
            if(arr[mid]==data){
                if(arr[mid-1]>=0 && arr[mid-1]== data) {
                    ei = mid-1;
                }
                else{
                    return mid;
                }
            }
                else if( arr[mid]< data){
                    si = mid+1;
                }
                else {
                    ei = mid+1;
                }
            
        }
         return -1;
}
/**************************************************************************/
public static int lastIndex(int[]arr, int data){
   int si = 0;
   int ei = arr.length-1;
    while(si<=ei){
        int mid = (si+ei)/2;
        if(arr[mid]==data) {
            if(arr[mid+1]< arr.length-1 && arr[mid+1]==data)
            return mid;
        }
        else if(arr[mid]<data){
            return si+1;
        }
        else {
            return ei-1;
        }
    }
    return -1;

}

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

    }
    
}
