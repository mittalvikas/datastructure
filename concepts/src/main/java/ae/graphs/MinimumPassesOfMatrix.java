package ae.graphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * A negative num can only be converted to positive if its one or more adjacent cell has positive.
 * Note: 0 is neither negative or positive.
 * in a sigle pass only one adjacent can be converted to positive.
 * We need to find the number of passes to convert all matrics.
 * Example :
 *
 * [    0   -2  -1
 *      -5  2    0
 *      -6  -2  0
 * ]
 *
 *
 *
 * Iteration 1:
 *
 *  [    0   2  -1
 *       5   2  0
 *      -6   2  0
 *  ]
 *  Iteration 2:
 *
 * [        0   2  1
 *          5   2  0
 *          6   2  0
 *    ]
 *  So the answer is 2;
 */

class Pair{
    int row;
    int col;
    public Pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
public class MinimumPassesOfMatrix {

    public int minimumPassesOfMatrix(int[][] matrix) {
        //collect positive positions because they can convert negatives to positives
        Queue<Pair> positives = new LinkedList<>();
        int totalNegative = 0;
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[0].length ; j++){
                if(matrix[i][j]>0)
                    positives.offer(new Pair(i,j));
                else if(matrix[i][j]<0)totalNegative++;
            }
        }

      // We are only on those numbers which are getting converted from negative to positive because only they can convert others.
    //BFS iterative
        int pass = 0;
        while(!positives.isEmpty()){
            int size =  positives.size();

            boolean changed = false;
            for(int i=0;i<size;i++){
                Pair p = positives.poll();

                //up
                if(p.row-1 >= 0 && matrix[p.row-1][p.col]<0){
                    matrix[p.row-1][p.col]=matrix[p.row-1][p.col]*-1;
                    positives.offer(new Pair(p.row-1,p.col));
                    changed = true;
                    totalNegative--;
                }

                //down
                if(p.row+1 < matrix.length && matrix[p.row+1][p.col]<0){
                    matrix[p.row+1][p.col]=matrix[p.row+1][p.col]*-1;
                    positives.offer(new Pair(p.row+1,p.col));
                    changed = true;
                    totalNegative--;
                }

                //left

                if(p.col-1 >= 0 && matrix[p.row][p.col-1]<0){
                    matrix[p.row][p.col-1]=matrix[p.row][p.col-1]*-1;
                    positives.offer(new Pair(p.row,p.col-1));
                    changed = true;
                    totalNegative--;
                }


                //right
                if(p.col+1 < matrix[0].length && matrix[p.row][p.col+1]<0){
                    matrix[p.row][p.col+1]=matrix[p.row][p.col+1]*-1;
                    positives.offer(new Pair(p.row,p.col+1));
                    changed = true;
                    totalNegative--;
                }

            }
            if(changed)pass++;
        }

        if(totalNegative>0)return -1;
        return pass;
    }
}
