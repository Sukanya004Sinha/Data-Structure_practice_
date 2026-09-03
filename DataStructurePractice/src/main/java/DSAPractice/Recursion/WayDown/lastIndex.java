package DSAPractice.Recursion.WayDown;

public class lastIndex {
    public static void main(String[] args) {
            int[] arr = {10, 19, 4, 5, 1, 19, 4, 4, 11, 19};
            int tar = 4;
            System.out.println(lastIndex(arr, arr.length-1, 4));

        }
        public static int lastIndex(int[] arr, int idx, int tar){
        if(idx==-1){
            return -1;
        }
     int smallestAns=   lastIndex(arr, idx-1, tar);
        if(arr[idx]== tar){
            return idx;
        }
            return smallestAns;

    }
}
