package linkedlist;

public class ReverseList {

    public static void main(String[] args) {

        Node<Integer> n = CreateList.createListFromArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        PrintList.print(reverseList(n));

        n = CreateList.createListFromArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        n = reverseListReccursive((Node<Integer> )null, n,n);

        PrintList.print(n);

    }

    private static Node<Integer> reverseListReccursive(Node<Integer> q,Node<Integer> p,Node<Integer> n) {

        if(p!=null){
           n = reverseListReccursive(p,p.next,n);
            p.next=q;
        }else{
            n=q;
        }
       return n;
    }

    private static Node<Integer> reverseList(Node<Integer> n) {

        Node<Integer> p = n;
        Node<Integer> q = null;
        Node<Integer> r = null;

        while(p!=null){
            r=q;
            q=p;
            p=p.next;
            q.next=r;
        }

        return q;

    }
}
