package linkedlist;


public class DoublyLinkedList {

    public static void main(String[] args) {

        DNode<Integer> first = null;

        for(int i=0;i<6;i++){

            first = insertNode(i,i+1,first);
        }

        displayList(first);

        first = reverseList(first);

        displayList(first);



    }

    private static DNode<Integer> reverseList(DNode<Integer> first) {

        DNode<Integer> p = first;

        while(p!=null){

            DNode<Integer> tmp = p.next;
            p.next = p.prev;
            p.prev = tmp;
            p = p.prev;
            if(p!=null && p.next==null){
                first = p;
            }
        }
        return first;

    }

    private static void displayList(DNode<Integer> first) {

        DNode<Integer> p = first;
        if(p != null){
            System.out.println("Printing List :");
            System.out.print("NULL");
            while(p!=null){
                System.out.print("<- "+p.data+" ->");
                p=p.next;
            }
            System.out.print("NULL");
            System.out.println();

        }
    }

    private static DNode<Integer> insertNode(int data, int position, DNode<Integer> first) {


        if(position==1){

            DNode<Integer> t = new DNode<Integer>(data);
            if(first!=null){
                t.next = first;
                first.prev = t;

            }
            return t;

        } else {

            DNode<Integer> t = new DNode<Integer>(data);
            DNode<Integer> p = first;

            for(int i=0;i<position-2 && p != null;i++){
                p = p.next;
            }

            t.prev = p;
            if(p!=null)
            p.next = t;
            return first;
        }
    }

}


class DNode<T>{

    T data;
    DNode<T> prev;
    DNode<T> next;

    public DNode(T data) {
        this.data = data;
    }
    public DNode() {

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        if(data!=null){
            sb.append("data=").append(data);
        }if(prev!=null && prev.data!=null){
            sb.append(" ,prev=").append(prev.data);
        }
        if(next!=null && next.data!=null){
            sb.append(" ,next=").append(next.data);
        }

        return sb.toString();

    }
}
