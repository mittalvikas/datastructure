package ae.heaps;

import java.util.PriorityQueue;

/**
 *  A k-sorted array is a partially sorted array in which all the elements are at most k position sorted.
 *  i.e [3,1,2,2] is k sorted with k=3 because each element in the array is atmost 3 positions away from its sorted position.
 */

public class SortKSortedArray {

    public int[] sortKSortedArray(int[] array, int k) {
        // Write your code here.

        if(array.length==0)return array;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        int i = 0;
        for(;i<Math.min(k+1,array.length);i++){
            heap.add(array[i]);
        }

        int idx=0;
        i=k+1;
        while(!heap.isEmpty()){
            array[idx++]=heap.remove();
            if(i<array.length)
                heap.add(array[i++]);
        }
        return array;
    }

}
