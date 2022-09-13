package ae.linkedlists;


/**
 * Merge two sorted linked lists
 */
public class MergeLinkdeLists {

    public static LinkedList mergeLinkedLists(LinkedList headOne, LinkedList headTwo) {

        LinkedList dummy = new LinkedList(0);
        LinkedList newHead = dummy;
        while(headOne!=null && headTwo!=null){
            if(headOne.value<headTwo.value){
                newHead.next = headOne;
                headOne = headOne.next;
            }else{
                newHead.next = headTwo;
                headTwo = headTwo.next;
            }
            newHead = newHead.next;
        }

        if(headOne!=null){
            newHead.next = headOne;
        }else if(headTwo!=null){
            newHead.next = headTwo;
        }
        return dummy.next;
    }
}
