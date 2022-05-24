package linkedlist;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Node<Integer> n = CreateList.createListFromArray(new int[]{1,1,2,3,3,3,4,5,6,7,7,7,7,7});
        PrintList.print(n);

        n = removeDuplicates(n);

        PrintList.print(n);

        PrintList.print(removeDuplicates(null));

        PrintList.print(removeDuplicates(CreateList.createListFromArray(new int[]{1})));
        PrintList.print(removeDuplicates(CreateList.createListFromArray(new int[]{1,1})));
        PrintList.print(removeDuplicates(CreateList.createListFromArray(new int[]{1,2})));


    }

    private static Node<Integer> removeDuplicates(Node<Integer> n) {

        if(n==null){
            return n;
        }
        Node<Integer> prev = n;
        Node<Integer> cur = n.next;

        while(cur!=null){

            if(prev.data!=cur.data){
                prev = cur;
                cur = cur.next;
            }else{
                prev.next = cur.next;
                cur = null;
                cur = prev.next;

            }

        }


        return n;

    }
}
