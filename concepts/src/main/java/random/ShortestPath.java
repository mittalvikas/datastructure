package random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Touple {
    int r;
    int c;
    int distance;
    public Touple(int r, int c,int distance){
        this.r=r;
        this.c=c;
        this.distance=distance;
    }
}

/*
Find minimal path to reach to 9 through 1. 0's are visited cells already
 */
public class ShortestPath {

    public int removeObstacle(int row,int cols,List<List<Integer>> lot){
        int minPath = Integer.MAX_VALUE;
        if(lot.get(0).get(0)==0) return -1;
        if(lot.get(0).get(0)==9) return 0;
        Queue<Touple> queue = new LinkedList<Touple>();
        queue.add(new Touple(0,0,0));
        boolean[][] vistited = new boolean[row][cols];
        vistited[0][0] = true;
        while(!queue.isEmpty()){

            Touple t = queue.poll();
            int r = t.r;
            int c = t.c;
            int distance = t.distance;

            if(lot.get(r).get(c)==9){
                minPath = Math.min(minPath,distance);
                break;
            }


            //move left
            if(isValid(r,c-1,lot,vistited)){
                vistited[r][c-1] = true;
                queue.offer(new Touple(r,c-1,distance+1));
            }
            //move right
            if(isValid(r,c+1,lot,vistited)){
                vistited[r][c+1] = true;
                queue.offer(new Touple(r,c+1,distance+1));
            }

            //move up
            if(isValid(r-1,c,lot,vistited)){
                vistited[r-1][c] = true;
                queue.offer(new Touple(r-1,c,distance+1));
            }

            //move down
            if(isValid(r+1,c,lot,vistited)){
                vistited[r+1][c] = true;
                queue.offer(new Touple(r+1,c,distance+1));
            }

        }


        return minPath == Integer.MAX_VALUE ? -1 : minPath;
    }

    private boolean isValid(int r, int c, List<List<Integer>> lot,boolean[][] visited) {

        int rows = lot.size();
        int cols = lot.get(0).size();
        if (r < 0 || c < 0 || r>= rows || c >= cols || visited[r][c]|| lot.get(r).get(c) == 0) {
            return false;
        }
        return true;
    }


    public static void main(String[] args) {

        ShortestPath sp = new ShortestPath();
        List<List<Integer>> input = new ArrayList<List<Integer>>();

        input.add(Arrays.asList(1,0,0));
        input.add(Arrays.asList(1,0,0));
        input.add(Arrays.asList(1,9,1));

        System.out.println(sp.removeObstacle(3,3, input));
    }
}
