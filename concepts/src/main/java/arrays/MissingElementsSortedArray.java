package arrays;

/**
 *    Multiple or single elements are missing in the sorted array.
 *
 *    by observing closely
 *
 *    {5,6,7,9,10,14,15,16}
 *    {0,1,2,3,4, 5,  6, 7} indexes
 *
 *    {5,5,5,6,6, 9,  9, 9}  // difference of a[i] - i should maintain other vise number is missing
 *    missing number will be i+diff
 *
 *
 *
 */

public class MissingElementsSortedArray {

    public static void main(String[] args) {

        System.out.println("Missing elements");

        missingElements(new int[]{5,6,7,9,10,14,15,16});


    }

    private static void missingElements(int[] arr) {

        int diff = arr[0];

        for(int i=0;i<arr.length;i++) {

            if(diff!= arr[i]-i){
              while(diff<arr[i]-i){
                  System.out.println("Missing "+(i+diff));
                  diff++; //since single or multiple number may be missing
              }
            }

        }


    }
}
