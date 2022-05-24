package linkedlist;

public class DeleteNode {

    public static void main(String[] args) {
        Node<Integer> n = CreateList.createListFromArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        PrintList.print(n);
        n=deleteNode(n,1);
        PrintList.print(n);

        n=deleteNode(n,4);
        PrintList.print(n);

        n=deleteNode(n,20);
        PrintList.print(n);
    }

    private static Node<Integer> deleteNode(Node<Integer> n, int position) {
        if(n==null){
            return n;
        }
        Node<Integer> prev = null;
        Node<Integer> cur = n;
        if(position==1){
            prev = n;
            cur = cur.next;
            prev.next=null;
            return cur;
        }

        for(int i=0;i<position-1 && cur != null;i++){
            prev = cur;
            cur=cur.next;
        }
        if(cur!=null) {
            prev.next = cur.next;
            cur = null;
        }
        return n;
    }


}
