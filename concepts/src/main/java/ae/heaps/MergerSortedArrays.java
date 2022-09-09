package ae.heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MergerSortedArrays {
    public static List<Integer> mergeSortedArrays(List<List<Integer>> arrays) {

        PriorityQueue<ItemWrapper> heap =  new PriorityQueue<>((a, b)->a.value-b.value);

        List<Integer> res = new ArrayList<Integer>();

        for(int i=0;i<arrays.size();i++){
            List<Integer> lst = arrays.get(i);
            heap.add(new ItemWrapper(lst.get(0),i,0));
        }

        while(!heap.isEmpty()){
            ItemWrapper item = heap.remove();
            res.add(item.value);

            if(arrays.get(item.iteratingarray).size()>item.idx+1){
                heap.add(new ItemWrapper(arrays.get(item.iteratingarray).get(item.idx+1),item.iteratingarray,item.idx+1));
            }

        }

        return res;
    }
}


class ItemWrapper {

    int value;
    int iteratingarray;
    int idx;
    public ItemWrapper(int value,int iteratingarray,int idx){
        this.value = value;
        this.iteratingarray = iteratingarray;
        this.idx=idx;
    }


}
