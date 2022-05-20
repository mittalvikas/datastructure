package linkedlist;

public class SumNodes {

    public static void main(String[] args) {

        System.out.println("Sum: "+add(CreateList.createListFromArray(new int[]{1,2,3,4,5,6,7,8})));

        System.out.println("Sum: "+addRecursive(CreateList.createListFromArray(new int[]{1,2,3,4,5,6,7,8})));


    }

    private static int add(Node<Integer> n) {
        int s = 0;
        while(n != null){
            s = s+n.data;
            n = n.next;
        }
        return s;
    }

    private static int addRecursive(Node<Integer> n) {

        if(n==null)return 0;

        return addRecursive(n.next)+n.data;
    }


}
