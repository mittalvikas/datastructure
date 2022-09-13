package ae.linkedlists;

public class ReverseTheList {

    public static LinkedList reverseLinkedList(LinkedList head) {
        LinkedList prev=null;
        LinkedList cur = head;
        LinkedList next = null;

        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;

        }

        return prev;
    }
}
