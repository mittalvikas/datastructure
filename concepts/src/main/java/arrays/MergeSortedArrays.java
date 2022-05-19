package arrays;

public class MergeSortedArrays {

    public static void main(String[] args) {

        int[] merged = merge(new int[]{1,2,3,4}, new int[]{3,5,6,7,8});

        System.out.println("Merged Array");

        for (int i:merged){
            System.out.println(i);
        }
    }

    private static int[] merge(int[] arr1, int[] arr2) {

        int start1 = 0;
        int start2 = 0;
        int index = 0;
        int[] merged = new int[arr1.length+arr2.length];

        while(start1 < arr1.length || start2 < arr2.length){
            int x = start1 < arr1.length ? arr1[start1] : Integer.MAX_VALUE;
            int y = start2 < arr2.length ? arr2[start2] : Integer.MAX_VALUE;
            if(x<y){
                merged[index++] = arr1[start1++];
            }else{
                merged[index++] = arr2[start2++];
            }
        }

        return merged;
    }
}
