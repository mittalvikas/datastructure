package recursion;

public class TowerOfHanoi {

    public static void main(String[] args) {

        System.out.println("Steps to solve the problem ");

        toh(3,"A","B","C");

    }

    private static void toh(int n, String a, String b, String c) {

        if(n>0){

            toh(n-1,a,c,b);

            System.out.println("Move from { "+a+" } to { "+c+" }" );

            toh(n-1,b,a,c);
        }

    }
}
