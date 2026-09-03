package DSAPractice.Recursion.WayUp;

public class FirstIndex {

        public static void main(String[] args) {
            int[] arr = {10,11, 19, 4, 5, 1, 19, 4, 4, 11, 19};
            int tar = 4;
            System.out.println(firstIndex(arr, 0, 11));


    }
    public static int firstIndex(int[] arr, int idx, int tar){
        if(idx==arr.length){
            return -1;
        }
      int smallestans =   firstIndex(arr, idx+1, tar);
        if(arr[idx]== tar){
            return idx;
        }
        return smallestans;


    }
}
