package ae.graphs;

/**
 * Given an array of negative and positive numbers.
 * value at index represents a jump. 2 means a jump of 2 indices forward and -3 means 3 indices backward.
 * jumps can be spilled arround the boudries of the array
 */

public class SingleCycleCheck {
    public static boolean hasSingleCycle(int[] array) {


        // [2,3,1,-4,-4,2]

        // jump 2 -- reached value 1
        // jump 1 -- reached value -4
        // jump -4 -- reached value 2 (which is last value in array)
        // jump 2 -- reached value 3
        // jump 3 -- reached -4 at index 4
        // jump -4 -- reached 2 (first value in array) that' the cycle definition


        int curIndex = 0;
        int itemsVisited = 0;
        while (itemsVisited < array.length) {
            itemsVisited++;
            //we are at 0
            // there can be 3 cases
            //1- jump can be within limit value is 2 (0+2)   0<ans && ans<array.size(6)
            //jump can be negative -- ans < 0  -2 index should be 4 0+(-2 = -2/6 4
            //jump can go beyond size  -- value at index 4 in 2 , 4 +2 =6%6 =0


            curIndex = curIndex +  array[curIndex];
            while(curIndex < 0) // because value at index can be too big
                curIndex=curIndex+array.length;
            curIndex=curIndex%array.length;
            if(curIndex==0)break; // cycle condition

        }

        if(itemsVisited<array.length)return false;
        return  curIndex == 0;
    }
}
