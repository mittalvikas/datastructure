package ae.linkedlists;

/**
 * Cut the list in half.
 * reverse the second half of the list
 * Compare each element of first half anf reversed second half.
 */

public class LinkedListPalindrome {

    public boolean linkedListPalindrome(LinkedList head) {
        LinkedList cur=head;
        int size=0;
        while(cur!=null){
            size++;
            cur=cur.next;
        }

        int count=0;
        LinkedList mid=head;
        while(count<size/2){
            mid=mid.next;
            count++;
        }
        if(size%2!=0 && mid.next!=null){
            mid=mid.next;
        }
        LinkedList secondHead = reverseLinkedList(mid);
        cur=head;
        while(secondHead!=null){
            if(secondHead.value!=cur.value){
                return false;
            }
            secondHead=secondHead.next;
            cur=cur.next;
        }

        return true;
    }


    private static LinkedList reverseLinkedList(LinkedList head) {
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
