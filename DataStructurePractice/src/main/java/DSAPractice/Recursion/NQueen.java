package DSAPractice.Recursion;

public class NQueen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] vis = new boolean[n][n];
        nQueenProblem(0, n, vis);
    }

    public static void printVisitedMatrix(boolean[][] vis) {

        for (int i = 0; i < vis.length; i++) {

            for (int j = 0; j < vis[0].length; j++) {

                if (vis[i][j] == true) {
                    System.out.print("(" + i + "," + j + ") ");
                }
            }
        }

        System.out.println();
    }

    public static boolean check(int row, int col, boolean[][] vis, int n) {


        for (int i = row - 1; i >= 0; i--) {

            if (vis[i][col] == true) {
                return false;
            }
        }


        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (vis[i][j] == true) {
                return false;
            }
        }


        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n;
             i--, j++) {

            if (vis[i][j] == true) {
                return false;
            }
        }

        return true;
    }

    public static void nQueenProblem(int row, int n, boolean[][] vis) {
        if (row == n) {
            printVisitedMatrix(vis);
            return;
        }
        for (int col = 0; col < n; col++) {

            if (check(row, col, vis, n) == true) {

                vis[row][col] = true;

                nQueenProblem(row + 1, n, vis);

                vis[row][col] = false;
            }
        }
    }
}

