package DSAPractice.TwoDArray;

public class Rotate {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
    public static void transpose(int[][] matrix) {
        //transpose
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i =0;i<n;i++){
            for(int j = i;j<m;j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void reverse(int[][] matrix) {
        int n = matrix.length;
        for(int row = 0;row<n;row++){
            int[] arr = matrix[row];
            int left = 0;
            int right = n-1;
            while(left<=right){
                int temp = arr[left];
                arr[left]= arr[right];
                arr[right] = temp;
                left++;
                right--;

            }


        }
    }
}

