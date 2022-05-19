package strings;

public class Palindrome {

    public static void main(String[] args) {
        String s= "racecar";

        int l=0;
        int r=s.length()-1;
        boolean isPalindrome = true;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                isPalindrome=false;
                break;
            }
            l++;
            r--;
        }

        System.out.println("String { "+s+" } is palindrome ? { "+isPalindrome+" }");
    }
}
