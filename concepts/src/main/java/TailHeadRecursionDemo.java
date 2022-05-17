/**
 * Tail recursion is function calling itself after the function steps
 * Head recursion is function calling itself before the function steps
 *
 */

public class TailHeadRecursionDemo {


    public static void main(String[] args) {
        System.out.println("Calling tail recursion");
        tail(5);

        System.out.println("Calling head recursion");
        head(5);
    }

    private static void tail(int n){

        if(n>0){
            System.out.println(n);
            tail(n-1);
        }

    }

    private static void head(int n){

        if(n>0){

            head(n-1);
            System.out.println(n);
        }

    }

}
