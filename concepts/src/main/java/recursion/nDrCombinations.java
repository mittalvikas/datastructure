package recursion;

/**
 *  nCr = n!/r!*(n-r)!
 *  This would be pascals trigale
 *
 *
 *                          1
 *                        1    1
 *                     1    2    1
 *                   1   3     3   1
 *                 1   4    6    4   1
 *
 *                Formula will be like : nCr = (n-1 C r-1) + (n-1 C r)
 */

public class nDrCombinations {

    public static void main(String[] args) {

        System.out.println("Result: "+ combinations(4,2));
    }

    private static int combinations(int n, int r) {

        if(n==r || r==0){
            return 1;
        } else {
            return combinations(n-1,r-1) + combinations(n-1,r);
        }
    }
}
