package ae.arrays;

import java.util.*;

public class TwoSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        int [] a = new int [2];
        Set<Integer> set = new HashSet<Integer>();
        for (int i=0; i< array.length;i++) {
            int temp = targetSum - array[i];
            if (set.contains(temp)) {
                a[0] = array[i];
                a[1] = temp;

                return a;
            } else {
                set.add(array[i]);
            }
        }
        return new int[0];
    }
}
