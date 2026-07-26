package DSAPractice.TwoDArray;

public class MatrixMultiplication {
    public static int[][] multiplyMatrix(int[][] A, int[][] B) {

        int r1 = A.length;
        int c1 = A[0].length;
        int r2 = B.length;
        int c2 = B[0].length;

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible");
            return new int[][]{};
        }

        int[][] res = new int[r1][c2];
          // Outer loop Matlab row change karta hai.
        for (int i = 0; i < r1; i++) { // row change
            // Matlab column change karta hai.
            for (int j = 0; j < c2; j++) { // col change

                int currentAns = 0;

                for (int k = 0; k < c1; k++) {
                    currentAns += A[i][k] * B[k][j];
                }

                res[i][j] = currentAns;
            }
        }

        return res;
    }
    public static void fillValues(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = (i + j);
            }
        }
    }

    public static void main(String[] args) {
        int[][] A = new int[4][3];
        int[][] B = new int[3][2];
        fillValues(A);
        fillValues(B);
        int[][] res = multiplyMatrix(A, B);
        print2DArray(res);
    }

    private static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}