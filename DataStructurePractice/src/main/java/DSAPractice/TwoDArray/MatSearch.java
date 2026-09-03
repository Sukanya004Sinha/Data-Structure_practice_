package DSAPractice.TwoDArray;

public class MatSearch {
    public static boolean matSeach(int mat[][], int tar){
    int n = mat.length;
    int m = mat[0].length;
    int row = 0;
    int col = m-1;
    while (row<n && col>=0){
        if(mat[row][col]==tar){
            return true;
        }
        else if(mat[row][col]<tar){
            row++;
        }
        else{
            col--;
        }

        }
    return false;
    }

}
