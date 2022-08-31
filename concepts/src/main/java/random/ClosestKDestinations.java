package random;

import java.util.PriorityQueue;

public class ClosestKDestinations {
    public int[][] getDeliveries(int[][] destinations, int numDeliveries) {

        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((a,b) -> (a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1]));

        for(int[] destination:destinations){
            queue.add(destination);
        }

        int[][] res = new int[numDeliveries][2];
        for(int i=0;i<numDeliveries;i++){
            res[i] = queue.poll();
        }
        return res;
    }


    public static void main(String[] args) {
       int[][] allLocations = new int[][]{new int[]{1,2}, new int[] {3,4}, new int[]{1,-1}};
       int numDeliveries = 2;

       ClosestKDestinations sol = new ClosestKDestinations();
       int[][] res = sol.getDeliveries(allLocations,numDeliveries);

       for(int[] cordinate:res){
           System.out.println(cordinate[0]+","+cordinate[1]);
       }


    }


}
