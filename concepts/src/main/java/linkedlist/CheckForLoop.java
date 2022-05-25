package linkedlist;

public class CheckForLoop {

    public static void main(String[] args) {

        Node<Integer> head = createLoop();

        System.out.println("Is loop exists "+ isLoop(head));

        System.out.println("Is loop exists "+ isLoop(null));

        System.out.println("Is loop exists "+ isLoop(CreateList.createListFromArray(new int[]{1,2,3})));



    }

    private static boolean isLoop(Node<Integer> head) {

        Node slow = head;
        Node fast = head;
        if(head==null) return false;

        do{
            slow= slow.next;
            fast=fast.next;
            fast=fast!=null?fast.next:fast;

        }while(slow!=null && fast!=null && slow!=fast);

        if(slow==fast){
            return true;
        }else{
            return false;
        }

    }

    private static Node<Integer> createLoop() {

        Node<Integer> head;


        head = new Node<Integer>(10);
        Node<Integer> tail = head;

        Node<Integer>cur = head;
        for(int i=0;i<5;i++){

            cur.next = new Node<Integer>(i+1);
            tail = cur.next;
            cur = cur.next;
        }

        tail.next=head;

        return head;



    }
}
