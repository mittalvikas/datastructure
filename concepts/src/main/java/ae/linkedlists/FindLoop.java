package ae.linkedlists;

/**
 *
 *   1->2->3->4->5-6
 *           ^      \
 *           |      V
 *           9<-8<-7
 *
 *if a is the a is the distance between head and loop, b is the point where slow and fast pointers meet and c is the distance from meeting point till loop.
 * slow and fast pointers will meet if loop is present at point b.
 *
 * 2*(distance cover by slow) = distance cover by fast
 * 2(a+ m*(b+c)+b) =  a+n(b+c)+b  because slow and fast may have oved m and n times in cycle before they meet.
 * a+b = (m-n) (b+c)
 *
 * a+b = $ (b+c)
 * if $ is 1,2,..n
 * a+b ~= b+c
 * or
 * a==c
 * means from meeting point af slow pointer start from head and fast start from meeting point each(single) step then they will meet at cycle.
 *
 *
 *
 *
 */
public class FindLoop {
    public static LinkedList findLoop(LinkedList head) {

        LinkedList slow = head;
        LinkedList fast = head;
        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast)break;
        }

        //if cycle is present they will again meet at cycle
        if(slow==fast){
            slow=head;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
        }
        return slow;
    }
}
