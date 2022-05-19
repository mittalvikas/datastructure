package arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = new int[]{2,3,9,16,18,21,28,32,35};

        int l =0;
        int r = arr.length-1;

        while(l<=r){

            int tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;

            l++;
            r--;
        }

        System.out.println("Reversed array:");

        for (int i: arr){
            System.out.println(i);
        }



    }

}
