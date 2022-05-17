package recursion;

public class FactorialDemo {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(factLoop(5));
    }

    private static int factLoop(int i) {
        int s = 1;
        while (i>1){
            s*=i;
            i--;
        }

        return s;
    }

    private static int fact(int i) {
        if(i<=0) return 1;
        return i*fact(i-1);
    }
}
