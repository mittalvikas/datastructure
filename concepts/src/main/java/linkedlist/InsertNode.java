package linkedlist;

public class InsertNode {


    public static void main(String[] args) {
        Node<Integer> n = CreateList.createListFromArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        PrintList.print(n);
        n = insertFirst(n,12);
        PrintList.print(n);

        n = CreateList.createListFromArray(new int[]{1, 2, 3, 4, 5, 6, 7});

        n = insert(n,4,12);
        PrintList.print(n);

        n = CreateList.createListFromArray(new int[]{1, 2, 3, 4, 5, 6, 7});

        n = insertLast(n,12);
        PrintList.print(n);


        n = null;
        for(int i=0;i<10;i++){
            n = insert(n,i,i+1);
        }
        PrintList.print(n);

        n = CreateList.createListFromArray(new int[]{ 2,3,  5, 11, 18});

        n = insertInSortedList(n,15);
        System.out.println("\nInserting in sorted list");
        PrintList.print(n);



    }

    private static Node<Integer> insertInSortedList(Node<Integer> node, int t) {

        Node<Integer> cur = node;
        Node<Integer> prev = null;

        while(cur!=null && cur.data<t){
            prev = cur;
            cur=cur.next;
        }
        Node<Integer> targetNode = new Node<Integer>(t);
        if(prev!=null) {
            targetNode.next = prev.next;
            prev.next = targetNode;
            return node;
        }else{
            targetNode.next = node;
            return targetNode;
        }


    }

    public static Node<Integer> insertFirst(Node<Integer> head,int val){

        Node<Integer> newNode = new Node<Integer>(val);
        if(head == null){
            head = newNode;
            return head;
        }

        newNode.next = head;
        head = newNode;

        return head;

    }

    public static Node<Integer> insert(Node<Integer> head,int position,int val){
        Node<Integer> target = new Node<Integer>(val);
        Node<Integer> cur = head;

        if(position==0){
           return insertFirst(head,val);
        }

        for(int i=0; i<position-1 && cur!=null; i++){
            cur = cur.next;
        }
        if(cur!=null){
            target.next = cur.next;
            cur.next = target;
        }
        return head;
    }

    public static Node<Integer> insertLast(Node<Integer> head,int val){

        Node<Integer> newNode = new Node<Integer>(val);

        if(head == null) return head;
        Node<Integer> cur = head;

        while (cur.next!=null){
            cur = cur.next;
        }

        cur.next = newNode;
        return head;

    }
}
