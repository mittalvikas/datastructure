package linkedlist;

public class SortedList {

    public static void main(String[] args) {


        System.out.println("Is list sorted ? "+isSorted(CreateList.createListFromArray(new int[]{1, 2, 3, 4, 5, 6, 7})));
        System.out.println("Is list sorted ? "+isSorted(CreateList.createListFromArray(new int[]{1, 2, 3, 14, 5, 6, 7})));
        System.out.println("Is list sorted ? "+isSorted(null));
        System.out.println("Is list sorted ? "+isSorted(CreateList.createListFromArray(new int[]{10,})));
        System.out.println("Is list sorted ? "+isSorted(CreateList.createListFromArray(new int[]{100, 2, 3, 14, 5, 6, 7})));


    }

    private static boolean isSorted(Node<Integer> head) {
        if(head==null){
            return true;
        }

        int prevValue = Integer.MIN_VALUE;
        Node<Integer> cur = head;
        while(cur!=null){

            if(prevValue > cur.data){
                return false;
            }
            prevValue = cur.data;
            cur=cur.next;

        }

        return true;
    }
}
