package DSAPractice.TwoDArray;

public class TwoDArray {

    public static void main(String[] args) {
        int[][] arr = new int[5][3];
        for(int i =0;i<arr.length;i++){
            int[] another1DArray = arr[i];
            System.out.println(another1DArray);
        }
    }
}