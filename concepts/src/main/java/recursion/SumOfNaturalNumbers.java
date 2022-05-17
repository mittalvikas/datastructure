package recursion;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {

        System.out.println(sumFormula(5));
        System.out.println(sumRec(5));

        System.out.println(sumLoop(5));


    }

    private static int sumLoop(int n) {

        int s=0;

        for(int i=1;i<=n;i++)s+=i;

        return s;

    }


    private static int sumRec(int n){

        if(n==0){
            return 0;
        }
        return n+sumRec(n-1);
    }
    private static int sumFormula(int n){

        return n*(n+1)/2;
    }

}
