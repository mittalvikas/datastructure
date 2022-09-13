package ae.linkedlists;


/**
 * return sum of not equal linked lists, these lists are in reverse order
 *
 * Example:
 *  2->4->7->1
 *  9->4->5
 *
 *  Answer = 1->9->2->2
 *
 *  1742 + 549 = 2291 and return in revers order 1->9->-2->2
 */
public class SumOfLinkedLists {

    public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {
        LinkedList newHead = new LinkedList(0);
        LinkedList tmp = newHead;

        int carry = 0;
        while(linkedListOne!=null || linkedListTwo!=null || carry!=0){
            int x = 0;
            int y = 0;
            if(linkedListOne!=null){
                x = linkedListOne.value;
                linkedListOne=linkedListOne.next;
            }
            if(linkedListTwo!=null){
                y = linkedListTwo.value;
                linkedListTwo=linkedListTwo.next;
            }
            int curTotal = x+y+carry;
            tmp.next = new LinkedList(curTotal%10);
            carry = curTotal/10;
            tmp = tmp.next;
        }


        return newHead.next;
    }
}
