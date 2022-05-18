package recursion;

/**
 *  Taylor series is like e pw x  = 1+ x/1!  + x pw 2/2!  + xpw 3/3! ..... +xpw n /n!
 */

public class TaylorSeries {

    static int factorial = 1;
    static int power = 1;
    public static void main(String[] args) {

        System.out.println("Result: "+ taylorSeries(4,2));

    }


    private static int taylorSeries(int x, int n){

        if(n==0){
            return 1;
        }

        int r = taylorSeries(x,n-1);
        factorial=factorial*n;
        power=power*x;

        return r+ power/factorial;

    }
}
