package recursion;

public class TreeRecursionDemo {

    public static void main(String[] args) {
        fun(3);
    }


    private static void fun(int x){

        if(x>0){

            System.out.println(x);
            fun(x-1);
            fun(x-1);

        }

    }
}
