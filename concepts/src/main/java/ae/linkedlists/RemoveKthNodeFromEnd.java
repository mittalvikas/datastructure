package ae.linkedlists;

public class RemoveKthNodeFromEnd {

    public static LinkedList removeKthNodeFromEnd(LinkedList head, int k) {

        LinkedList fast = head;
        LinkedList slow = head;
        LinkedList prev = null;

        while(fast!=null && k>0){
            fast=fast.next;
            k--;
        }

        while(fast!=null){
            prev = slow;
            slow=slow.next;
            fast=fast.next;
        }

        if(prev!=null && slow!=null){
            prev.next=slow.next;
        }else{
            head.value=slow.next.value;  // if deleting head then prev will be null. slow will be pointing at head.
            head.next=slow.next.next;
        }

        return head;

    }
}
