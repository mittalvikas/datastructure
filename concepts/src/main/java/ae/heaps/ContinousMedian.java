package ae.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * find median of integer stream in O(1) time complexity
 */
public class ContinousMedian {

    double median = 0;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());


    //first part of the array we need max heap because we are interested in maximum number
    //second half of the array will use min use because need smallest number from it

    public void insert(int number) {

        if(minHeap.size()==maxHeap.size()){


            if(minHeap.size()!=0 && number>minHeap.peek()){
                minHeap.add(number);
                maxHeap.add(minHeap.remove());
            }else{
                maxHeap.add(number);
            }

            median = maxHeap.peek();
        }else{
            if(minHeap.size()==0 || number>minHeap.peek()){
                minHeap.add(number);
            }else{
                maxHeap.add(number);
                minHeap.add(maxHeap.remove());
            }

            median = (double)(minHeap.peek()+maxHeap.peek())/2;


        }

    }

    public double getMedian() {
        return median;
    }
}
