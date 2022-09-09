package ae.heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * find the function to returns minimum number of laptops that needs to rent such that all students will always have access
 * to a laptop when they need one. start time and end time araay of times will be given as input.
 */
public class LaptopRentals {
    public int laptopRentals(ArrayList<ArrayList<Integer>> times) {
        // Write your code here.
        List<Interval> sortedTimes= new ArrayList<>();
        for(List<Integer> time:times){
            sortedTimes.add(new Interval(time.get(0),time.get(1)));
        }

        Collections.sort(sortedTimes,(i1, i2)->i1.start-i2.start);
        PriorityQueue<Interval> laptops = new PriorityQueue<>((i1, i2)-> {
            return i1.end-i2.end;
        });
        int max = 0;
        for(Interval time:sortedTimes){
            if(laptops.isEmpty()){
                laptops.add(time);
                max=Math.max(max,laptops.size());
            }else if(!laptops.isEmpty() && isOverlapping(laptops.peek(),time)){
                laptops.add(time);
                max=Math.max(max,laptops.size());
            }else if(!laptops.isEmpty() && !isOverlapping(laptops.peek(),time)){
                laptops.add(time);
                laptops.remove();
            }

        }
        return max;
    }
    private static boolean isOverlapping(Interval i1,Interval i2){

        if(i1.end>i2.start){
            return true;
        }
        return false;

    }
}
    class Interval {
        int start;
        int end;
        public Interval(int start,int end){
            this.start=start;
            this.end=end;
        }
        public String toString(){
            return "[ "+start+", "+end+" ]";
        }
    }
