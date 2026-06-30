/**
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 * <p>
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: grid = [
 * <p>
 * ["1","1","1","1","0"],
 * <p>
 * ["1","1","0","1","0"],
 * <p>
 * ["1","1","0","0","0"],
 * <p>
 * ["0","0","0","0","0"]
 * <p>
 * ]
 * <p>
 * Output: 1
 * <p>
 * Example 2:
 * <p>
 * Input: grid = [
 * <p>
 * ["1","1","0","0","0"],
 * <p>
 * ["1","1","0","0","0"],
 * <p>
 * ["0","0","1","0","0"],
 * <p>
 * ["0","0","0","1","1"]
 * <p>
 * ]
 * <p>
 * Output: 3
 * <p>
 * <p>
 * Constraints:
 * <p>
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 300
 * grid[i][j] is '0' or '1'.
 */
//// ["1","1","1","1","0"],
// *
// *   ["1","1","0","1","0"],
// *
// *   ["1","1","0","0","0"],
// *
// *   ["0","0","0","0","0"]

//    count = 0
//    row = 0
//     col = 0
//
//grid[0][0] = 1
//land
//count = 1
//            maek visted
//          0,,"1","1","1","0"],
//// *
//// *   ["1","1","0","1","0"],
//// *
//// *   ["1","1","0","0","0"],
//// *
//// *   ["0","0","0","0","0"]
//DFS

//   from (1,0)
//   , 0 , "1","1","1","0"],
// *
// *   ["0","1","0","1","0"],
// *
// *   ["1","1","0","0","0"],
// *
// *   ["0","0","0","0","0"]
// 2, 0

//
//
//    , 0 , "1","1","1","0"],
// *
// *   ["0","1","0","1","0"],
// *
// *   ["0","1","0","0","0"],
// *
// *   ["0","0","0","0","0"]


public class BinaryGrid {
    public static void main(String[] args) {
        int[][] grid =
                {


                };

        int count = numIslands(grid);
        System.out.println("Number of islands " + count);
    }

    private static void dfs(int[][] grid, int r, int c) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (r < 0 || r >= rows || c < 0 || c >= cols || grid[r][c] != 1) {
            return;
        }
        grid[r][c] = 0;
        dfs(grid, r + 1, c); // down
        dfs(grid, r - 1, c);  // up
        dfs(grid, r, c + 1); // right
        dfs(grid, r, c - 1); //left

    }
    public static int numIslands(int[][] grid) {
        int count = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    count++;
                    dfs(grid, r, c);
                }
            }

        }
        return count;
    }


}
