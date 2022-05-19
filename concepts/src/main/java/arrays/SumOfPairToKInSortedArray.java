package arrays;

import java.util.HashSet;
import java.util.Set;

public class SumOfPairToKInSortedArray {

    public static void main(String[] args) {


        int[] arr =  new int[] {3,5,6,7,8,9,10,16,14};

        sumOfPair(arr,15);
    }

    private static void sumOfPair(int[] arr, int target) {

        int l=0;
        int r=arr.length-1;

        while(l<r){

            if(arr[l]+arr[r]==target){
                System.out.println("for target "+ target +" numbers found " +arr[l] +" and "+ arr[r] );
                l++;
            }else if(arr[l]+arr[r]>=target){
                r--;
            }else{
                l++;
            }

        }

    }
}
