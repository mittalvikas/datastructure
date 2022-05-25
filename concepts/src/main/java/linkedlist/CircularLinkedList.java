package linkedlist;

public class CircularLinkedList {

    public static void main(String[] args) {

        System.out.println("Creating list");
        Node<Integer> head = createCircularList();

        displayList(head);
        System.out.println("Inserting before head");
        head = insertNode(head,12,0);
        displayList(head);

        System.out.println("inserting at position 3");
        head = insertNode(head,15,3);
        displayList(head);

        System.out.println("Delete first Node");
        head = deleteNode(head,1);
        displayList(head);
        System.out.println("Delete 4th Node");
        head = deleteNode(head,4);
        displayList(head);

    }

    private static Node<Integer> deleteNode(Node<Integer> head, int position) {

        if(position == 1){

            Node<Integer> p = head;

            while(p.next!=head){
                p=p.next;
            }

            p.next=head.next;
            head.next=null;
            head =null;
            head = p.next;


        }else{

            Node<Integer> prev = head;
            Node<Integer> cur = null;
            for(int i=0;i<position-2;i++){
                prev = prev.next;

            }

            cur = prev.next;

            prev.next = cur.next;


        }

        return head;
    }

    private static Node<Integer> insertNode(Node<Integer> head, int x, int position) {

        if(position==0){

            Node<Integer> p = head;

            while(p.next!=head){
                p=p.next;
            }

            Node<Integer> t=new Node<Integer>(x);
            t.next = head;
            p.next = t;
            head = t;

        } else{

            Node<Integer> p = head;

            for(int i=0;i<position-1;i++){
                p=p.next;
            }

            Node<Integer> t=new Node<Integer>(x);

            t.next = p.next;
            p.next = t;



        }
        return head;
    }

    private static void displayList(Node<Integer> head) {
        Node<Integer> p = head;

        do{
            System.out.print(p.data+"->");
            p=p.next;
        }while(p!=head);
        System.out.println();

    }


    private static Node<Integer> createCircularList() {

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
