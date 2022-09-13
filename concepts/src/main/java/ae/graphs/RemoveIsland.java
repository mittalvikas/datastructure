package ae.graphs;

/**
 * {
 *           {1, 0, 0, 0, 0, 0},
 *           {0, 1, 0, 1, 1, 1},
 *           {0, 0, 1, 0, 1, 0},
 *           {1, 1, 0, 0, 1, 0},
 *           {1, 0, 1, 1, 0, 0},
 *           {1, 0, 0, 0, 0, 1},
 *         }
 *
 *         1 represents the island. An island is any number of 1's connected horizontally and vertically but not diagonally.
 *         Note : A gorup of 1's connected horizontally and vertically but not in first and last roow and first and last column
 *         Write a function to remove islands and return modified version of matrix.
 *
 *         Output will be :
 *
 *         {
 *           {1, 0, 0, 0, 0, 0},
 *           {0, 0, 0, 1, 1, 1},
 *           {0, 0, 0, 0, 1, 0},
 *           {1, 1, 0, 0, 1, 0},
 *           {1, 0, 0, 0, 0, 0},
 *           {1, 0, 0, 0, 0, 1
 */

public class RemoveIsland {

    public int[][] removeIslands(int[][] matrix) {

        // 1st row and last row -- run DFS --> mark that as 2 (update from 1 to 2)
        // 1st and last col --  run DFS --> mark that as 2 (update from 1 to 2)

        // checking 1st Row

        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 1 ) {
                dfs(0,j,matrix);
            }
        }

        // for last row
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[matrix.length-1][j] == 1 ) {
                dfs(matrix.length-1,j,matrix);
            }
        }

        // first column

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 1 ) {
                dfs(i,0,matrix);
            }
        }

        //last columns

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][matrix[0].length-1] == 1 ) {
                dfs(i,matrix[0].length-1,matrix);
            }
        }

        //removing actual islands
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length;j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] = 0 ;
                }
            }
        }

        //reverting false islands
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length;j++) {
                if (matrix[i][j] == 2) {
                    matrix[i][j] = 1 ;
                }
            }
        }


        return matrix;
    }


    public static void dfs (int row, int col, int[][] matrix) {

        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length || matrix[row][col] != 1) {
            return;
        }

        matrix[row][col] = 2;

        dfs(row-1,col,matrix);
        dfs(row+1,col,matrix);
        dfs(row,col-1,matrix);
        dfs(row,col+1,matrix);


    }
}
