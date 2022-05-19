package arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{2,3,9,16,18,21,28,32,35};
        System.out.println("Search found at: "+ search(arr,9));
    }

    private static int search(int[] arr,int target) {

        int l =0 ;
        int r = arr.length-1;

        while(l<=r){
            int m = (l+r)/2;

            if(arr[m]==target){
                return m;
            }

            if(target>arr[m]){
                l=m+1;
            }else{
                r=m-1;
            }


        }
        return -1;
    }
}
