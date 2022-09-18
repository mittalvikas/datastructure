package ae.linkedlists;

/**
 * Swap the nodes in pair
 * Example : 0->1->2->3->4->5
 * O/P : 1->0->3->2->5->4
 *
 * Solutions: collect even and odd node into two different linked lists
 * and merge them will be the swapped list.
 *
 */
public class NodeSwap {

    public LinkedList nodeSwap(LinkedList head) {

        LinkedList firstHead = new LinkedList(0);
        LinkedList f1 = firstHead;
        LinkedList secondHead = new LinkedList(0);
        LinkedList f2 = secondHead;
        LinkedList tmp = head;
        int size = 0;

        while(tmp!=null){
            if(size%2==0){
                f1.next = tmp;
                f1 = f1.next;
            }else{
                f2.next = tmp;
                f2 = f2.next;
            }
            tmp=tmp.next;
            size++;
        }

        f1.next=null;
        f2.next=null;


        return mergeList(secondHead.next,firstHead.next);
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
}
