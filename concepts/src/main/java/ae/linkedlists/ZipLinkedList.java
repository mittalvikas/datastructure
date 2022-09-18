package ae.linkedlists;

/**
 * Rearrange the linked list as
 *
 * 1s - kthnode->2nd -> k-1th ->3rd -> k-3 th ....
 *
 * Sol : break tlest in half.
 * reverse the second half
 * merge both the lists
 */

public class ZipLinkedList {


    public LinkedList zipLinkedList(LinkedList linkedList) {
        LinkedList prev=null;
        LinkedList slow=linkedList;
        LinkedList fast= linkedList;
        if(linkedList == null || linkedList.next== null ){
            return linkedList;
        }
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }

        if(prev!=null)
            prev.next=null;
        LinkedList f2Reverse = reverseLinkedList(slow);


        return mergeList(linkedList,f2Reverse);



    }

    private static LinkedList mergeList(LinkedList l1,LinkedList l2){
        LinkedList mergedHead = new LinkedList(0);
        LinkedList f3 = mergedHead;

        while(l1!=null){
            f3.next=l1;
            f3=f3.next;
            l1=l1.next;
            f3.next=l2;
            f3=f3.next;
            l2=l2.next;
        }
        if(l2!=null){
            f3.next=l2;
            f3=f3.next;
        }
        return mergedHead.next;
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
