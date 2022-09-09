package ae.graphs;


import java.util.ArrayList;
import java.util.List;

/**
 * {
 *       {1, 0, 0, 1, 0},
 *       {1, 0, 1, 0, 0},
 *       {0, 0, 1, 0, 1},
 *       {1, 0, 1, 0, 1},
 *       {1, 0, 1, 1, 0},
 *     }
 *
 *  where 0 represent land and 1 represent river.A river can consists of any number of 1's horizontaly , and vertically adjacent not diagonally.
 *  The function should return the array of sizes or rivers.
 *  ans will be like [1,2,2,2,5]
 *
 *
 *
 */
public class RiverSizes {

    public static List<Integer> riverSizes(int[][] matrix) {
        // 0 -- land
        // 1 -- river
        List<Integer> res = new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1){
                    List<String> temp = new ArrayList<>();
                    DFS(i,j,matrix,temp);
                    res.add(temp.size());
                }
            }

        }

        return res;
    }

    // when we encounter 1 -->
    // track visited nodes by making it 0
    // directions :: L,R,U,D

    public static void DFS(int row, int col, int[][] matrix, List<String> riverCounter){

        if(row<0 || row >= matrix.length || col < 0 || col >= matrix[0].length || matrix[row][col]==0){
            return;
        }
        riverCounter.add("1");
        matrix[row][col] = 0;
        //left
        DFS(row,col-1,matrix,riverCounter);
        //right

        DFS(row,col+1,matrix,riverCounter);


        //up
        DFS(row-1,col,matrix,riverCounter);

        //down
        DFS(row+1,col,matrix,riverCounter);



    }

}
