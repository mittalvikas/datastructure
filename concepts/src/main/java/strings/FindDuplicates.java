package strings;

public class FindDuplicates {

    public static void main(String[] args) {

        String s = "finding";

        int[] counts = new int[26];

        for(char c:s.toCharArray()){

            counts[c-'a']++;
        }

        System.out.println("Duplicates in String: " + s);
        for(int i=0;i<26;i++){
            if(counts[i]>1)
            System.out.println((char)(i+'a'));
        }


    }
}
