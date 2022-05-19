package arrays;

public class FindDuplicatesInSortedArray {


    public static void main(String[] args) {

        System.out.println("Duplicates");

        findDuplicates(new int[] {3,6,8,8,10,12,15,15,15,20,21,21});

    }

    private static void findDuplicates(int[] nums) {
        int lastDuplicate = 0;
        for(int i=0;i<nums.length-1;i++){

            if(nums[i]==nums[i+1] && nums[i]!=lastDuplicate){
                System.out.println(nums[i]);
                lastDuplicate=nums[i];
            }

        }
    }
}
