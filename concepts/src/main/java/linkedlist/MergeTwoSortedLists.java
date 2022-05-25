package linkedlist;

public class MergeTwoSortedLists {

    public static void main(String[] args) {

        Node<Integer> n1 = CreateList.createListFromArray(new int[]{1, 2, 3, 8, 9,15});

        Node<Integer> n2 = CreateList.createListFromArray(new int[]{ 2, 4 ,16,18});

        Node<Integer> mergedList = merge(n1,n2);
        PrintList.print(mergedList);

    }

    private static Node<Integer> merge(Node<Integer> n1, Node<Integer> n2) {

        Node<Integer> mergedFirst = null;
        Node<Integer> cur = null;

        if(n1.data<n2.data){
            mergedFirst = cur = n1;
            n1 = n1.next;
            cur.next = null;

        } else {

            mergedFirst = cur = n2;
            n2 = n2.next;
            cur.next = null;
        }

        while(n1!=null && n2!=null){

            if(n1.data<n2.data) {
                cur.next = n1;
                cur = n1;
                n1 = n1.next;
                cur.next = null;

            }else{

                cur.next = n2;
                cur = n2;
                n2 = n2.next;
                cur.next = null;
            }

        }

        if(n1!=null){
            cur.next = n1;
        }else if(n2 != null){
            cur.next = n2;
        }
        return mergedFirst;
    }
}
