package recursion;

public class PowerOfNumber {

    public static void main(String[] args) {

        System.out.println(" Ans "+ pow(2,3));

    }


    private static int pow(int m,int n){


        if(n==0){
            return 1;
        }
        if(n%2==0){
            return  pow(m*m,n/2);
        }else{
            return  m*pow(m*m,n/2);
        }
    }
}
