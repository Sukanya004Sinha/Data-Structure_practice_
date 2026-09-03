package DSAPractice.Recursion.WayUp;

public class LastIndex {
    public static void main(String[] args) {
        int[] arr = {10, 19, 4, 5, 1, 19, 4, 4, 11, 19};
    int tar = 4;
        System.out.println(lastIndex(arr,0,tar));
    }
    public static int lastIndex(int[] arr, int idx, int tar){
        if (idx==arr.length-1) {
            return -1;
        }
      int lastIdx =  lastIndex(arr, idx+1, tar);
        if(lastIdx!=-1){
            return lastIdx;
        }
        if(arr[idx]==tar){
            return idx;
        }

      return lastIdx;


    }
}
