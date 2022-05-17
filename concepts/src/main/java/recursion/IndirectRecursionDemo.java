package recursion;

public class IndirectRecursionDemo {
    public static void main(String[] args) {
        funA(20);
    }


    private static void funA(int x){

        if(x>0){
            System.out.println(x);
            funB(x-1);
        }
    }

    private static void funB(int x) {
        if(x>0){
            System.out.println(x);
            funA(x/2);
        }
    }
}
