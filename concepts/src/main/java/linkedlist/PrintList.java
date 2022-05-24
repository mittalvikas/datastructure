package linkedlist;

public class PrintList {
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        Node<Integer> head = CreateList.createListFromArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        System.out.println("Iterative list display");
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println();
        System.out.println("Recursive list display");
        display(CreateList.createListFromArray(new int[]{1, 2, 3, 4, 5, 6, 7}));

        System.out.println("Recursive list reverse display");
        sb = new StringBuilder("NULL");
        displayReverse(CreateList.createListFromArray(new int[]{1, 2, 3, 4, 5, 6, 7}));
        System.out.println(sb);

    }

    public static void print(Node head){
        Node cur = head;
        System.out.println();
        while(cur!=null){
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
        System.out.print("NULL");

    }


    private static void display(Node head){

        if(head==null){
            sb.append("NULL");
            System.out.println(sb.toString());
            return;
        }

        sb.append(head.data).append("->");
        display(head.next);


    }
    private static void displayReverse(Node head){

        if(head!=null) {
            displayReverse(head.next);
            sb.append("<-").append(head.data);
        }






    }

}
