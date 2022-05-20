package linkedlist;

public class MaxElement {
    public static void main(String[] args) {

        System.out.println("Max: "+maxElement(CreateList.createListFromArray(new int[]{9,4,11,19,7,8})));

        System.out.println("Max: "+maxElementRecursive(CreateList.createListFromArray(new int[]{9,4,11,19,7,8})));

    }

    private static int maxElementRecursive(Node<Integer> head) {

        if(head==null){
            return Integer.MIN_VALUE;
        }

        return Math.max(maxElementRecursive(head.next),head.data);
    }

    private static int maxElement(Node<Integer> head) {

        int max = Integer.MIN_VALUE;

        while(head!=null){

            max = Math.max(max,head.data);
            head=head.next;
        }

        return max;
    }

}
