package linkedlist;

public class LinierSearch {
    public static void main(String[] args) {

        System.out.println("Search: "+searchElement(CreateList.createListFromArray(new int[]{9,4,11,19,7,8}),11));

        System.out.println("Search: "+searchElementRecursive(CreateList.createListFromArray(new int[]{9,4,11,19,7,8}),11));

    }

    private static Node<Integer> searchElement(Node<Integer> head, int target) {

        Node<Integer> cur = head;

        while(cur != null){

            if(cur.data == target){
                return cur;
            }
            cur = cur.next;

        }

        return null;
    }

    private static Node<Integer> searchElementRecursive(Node<Integer> head, int target) {

        if(head ==  null || head.data == target) return head;

        return searchElementRecursive(head.next,target);

     }
}
