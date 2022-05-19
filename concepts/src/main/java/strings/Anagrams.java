package strings;

/**
 *
 *
 * Two strings will be angrams if characters in both the strings are same and in any order
 */

public class Anagrams {

    public static void main(String[] args) {
        String s1 = "decimal";
        String s2 =  "medical";

        System.out.println(s1+" and "+s2 +" are anagrams ? "+ isAnagram(s1,s2));

    }

    private static boolean isAnagram(String s1, String s2) {

        if(s1.length()!=s2.length()){
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for(char c: s1.toCharArray()){
            s1Count[c-'a']++;
        }

        for(char c: s2.toCharArray()){
            s2Count[c-'a']++;
        }

        for(int i=0;i<26;i++){
            if(s1Count[i]!=s2Count[i])return false;
        }

        return true;

    }
}
