package ae.linkedlists;

/**
 * Re arrange linked list based on value passed. smaller values first then equal values then greater values.
 */
public class RearrangeLinkedList {
    public static LinkedList rearrangeLinkedList(LinkedList head, int k) {
        LinkedList dummy1 = new LinkedList(0);
        LinkedList dummy2 = new LinkedList(0);
        LinkedList dummy3 = new LinkedList(0);

        LinkedList smaller = dummy1;
        LinkedList greater = dummy2;
        LinkedList equal = dummy3;

        while(head!=null){
            if(head.value==k){
                equal.next=head;
                equal=equal.next;
            }else if(head.value<k){
                smaller.next=head;
                smaller=smaller.next;
            }else{
                greater.next=head;
                greater=greater.next;
            }
            head=head.next;
        }

        greater.next=null; // cutting after last node.
        equal.next=dummy2.next; // greater will be after the equal list
        smaller.next=dummy3.next; // equal list will be after smaller list
        return dummy1.next; // return first node after smaller

    }
}
