package recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FibonacciWithMemoiazation {
    static int[] memo;
    public static void main(String[] args) {

        memo = new int[10];
        Arrays.fill(memo,-1);
        //memo[0] = 0;
       // memo [1] = 1;
        System.out.println("Result: " + fibo(8));
    }

    private static int fibo(int i) {

        if (i <= 1) {
            memo[i] = i;
            return i;
        } else {

            if (memo[i - 2] == -1) {
                memo[i - 2] = fibo(i - 2);
            }
            if (memo[i - 1] == -1) {
                memo[i - 1] = fibo(i - 1);
            }

            memo[i] = memo[i - 2] + memo[i - 1];
            return memo[i];

        }

    }
}
