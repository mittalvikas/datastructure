public class RecursionGlobalVariableDemo {
    private static int globalVar = 0;
    
    public static void main(String[] args) {
        System.out.println("localVariableFunc: "+localVariableFunc(3));
        System.out.println("globalVariableFunc: "+globalVariableFunc(5));
    }

    private static int localVariableFunc(int x){

        if(x>0){

            return localVariableFunc(x-1)+x;
        }
        return 0;
    }
    private static int globalVariableFunc(int x){

        if(x>0){
            globalVar++;
            return globalVariableFunc(x-1)+globalVar;
        }
        return 0;
    }
}
