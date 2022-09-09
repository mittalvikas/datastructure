package ae.binarysearchtree;

import java.util.ArrayList;
import java.util.List;

public class SameBST {
    public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {

        if(arrayOne.size()==0 && arrayTwo.size()==0)return true;
        if(arrayOne.size() != arrayTwo.size())return false;
        if(arrayOne.get(0)!=arrayTwo.get(0)) return false;

        List<Integer> smaller1 = smallerElements(arrayOne);
        List<Integer> smaller2 = smallerElements(arrayTwo);

        List<Integer> greater1 = greaterElements(arrayOne);
        List<Integer> greater2 = greaterElements(arrayTwo);

        return sameBsts(smaller1,smaller2) && sameBsts(greater1,greater2);
    }

    private static List<Integer>smallerElements(List<Integer> lst){
        List<Integer> res = new ArrayList<>();
        for(int i = 1;i<lst.size();i++){
            if(lst.get(i)<lst.get(0)){
                res.add(lst.get(i));
            }
        }
        return res;
    }

    private static List<Integer>greaterElements(List<Integer> lst){
        List<Integer> res = new ArrayList<>();
        for(int i = 1;i<lst.size();i++){
            if(lst.get(i)>=lst.get(0)){
                res.add(lst.get(i));
            }
        }
        return res;
    }
}
