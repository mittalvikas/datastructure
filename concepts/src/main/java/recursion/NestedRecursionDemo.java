package recursion;

public class NestedRecursionDemo {
    public static void main(String[] args) {
       int res = fun(95);
        System.out.println("Result: "+res);
    }

    private static int fun(int n) {

        if(n>100)
            return n-10;
        else
           return fun(fun(n+11));

    }
}
