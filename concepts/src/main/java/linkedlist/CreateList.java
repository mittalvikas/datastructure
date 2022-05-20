package linkedlist;

public class CreateList {

    public static Node<Integer> createListFromArray(int[] nums){

        Node head = new Node();

        Node cur = head;

        for(int n:nums){

            cur.next = new Node(n);
            cur = cur.next;
        }
        return head.next;
    }

}
