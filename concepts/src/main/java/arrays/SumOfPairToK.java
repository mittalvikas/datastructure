package arrays;

import java.util.HashSet;
import java.util.Set;

public class SumOfPairToK {

    public static void main(String[] args) {


        int[] arr =  new int[] {6,3,8,10,16,7,5,2,9,14};

        sumOfPair(arr,10);
    }

    private static void sumOfPair(int[] arr, int target) {

        Set<Integer> seen = new HashSet<Integer>();

        for(int n:arr){

            if(seen.contains(target-n)){
                System.out.println("for target "+ target +" numbers found " +n +" and "+ (target-n) );
            }else{
                seen.add(n);
            }

        }

    }
}
