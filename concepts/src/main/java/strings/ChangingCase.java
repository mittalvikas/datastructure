package strings;

public class ChangingCase {

    public static void main(String[] args) {

        String s = "WELCOME";

        String sb = new String();
        for(char c:s.toCharArray()){
            sb+=(char)(c - ('A'-'a'));
        }
        System.out.println(sb);

    }
}
