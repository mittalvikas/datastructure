package arrays;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicatesInUnSortedArray {


    public static void main(String[] args) {

        System.out.println("Duplicates");

        findDuplicates(new int[] {8,8,3,10,15,15,15,20});

    }

    private static void findDuplicates(int[] nums) {
        Map<Integer,Integer> seen = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){

            seen.put(nums[i],seen.getOrDefault(nums[i],0)+1);

        }

        for(Map.Entry<Integer,Integer> e:seen.entrySet()){
            if(e.getValue()>1){
                System.out.println(e.getKey());
            }
        }


    }
}
