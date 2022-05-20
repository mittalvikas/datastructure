package linkedlist;

public class CountNodes {

    public static void main(String[] args) {

        System.out.println("Count: "+count(CreateList.createListFromArray(new int[]{1,2,3,4,5,6,7,8})));

        System.out.println("Count: "+countRecursive(CreateList.createListFromArray(new int[]{1,2,3,4,5,6,7,8})));


    }

    private static int count(Node n) {
        int c = 0;
        while(n != null){
            c++;
            n = n.next;
        }
        return c;
    }

    private static int countRecursive(Node n) {

        if(n==null)return 0;

        return countRecursive(n.next)+1;
    }


}
