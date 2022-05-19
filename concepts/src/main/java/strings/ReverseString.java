package strings;

public class ReverseString {

    public static void main(String[] args) {
        String s = "python";
        int l=0;
        int r=s.length()-1;
        StringBuilder sb = new StringBuilder();
        while(r>=0){
            sb.append(s.charAt(r--));

        }

        System.out.println(sb);
    }
}
