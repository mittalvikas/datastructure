package arrays;

public class MissingElementsUnsortedArray {

    public static void main(String[] args) {
        System.out.println("Missing numbers");

        missingNumbers(new int[]{2,5,3,4,6,9,7},9);
    }

    private static void missingNumbers(int[] arr,  int end) {

        boolean[] seen = new boolean[end+1];

        for(int  i:arr){
            seen[i]=true;
        }

        for(int i=1;i<seen.length;i++){
            if(!seen[i]){
                System.out.println(i);
            }
        }

    }
}
