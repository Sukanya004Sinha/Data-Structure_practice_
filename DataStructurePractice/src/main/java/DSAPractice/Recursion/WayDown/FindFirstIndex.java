package DSAPractice.Recursion.WayDown;

public class FindFirstIndex {
    public static void main(String[] args) {
        int[] arr = {10, 19, 4, 5, 1, 19, 4, 4, 11, 19};
        int tar = 4;
        System.out.println(firstIndex(arr, 0, 4));

    }

    public static int firstIndex(int[] arr,  int idx, int tar) {
        if(idx==arr.length){
            return -1;
        }
        if (arr[idx] == tar) {
            return idx;
        }
        int smallestans = firstIndex(arr, idx + 1, tar);
        return smallestans;
    }
}

