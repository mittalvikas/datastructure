package backtracking;

public class StringPermutations {

    private static int[] charUsed;
    private static char[] result;

    public static void main(String[] args) {

        String s = "ABC";
        charUsed = new int[s.length()];
        result = new char[s.length()];

        System.out.println("Generating permutations of "+s);

        permutations(s,0);
    }

    private static void permutations(String s, int position) {

        if(position==s.length()){
            System.out.println();
            for(char c:result){
                System.out.print(c);
            }
           return;
        }

        for(int i=0;i<s.length();i++){
            if(charUsed[i]==0){
                result[position]=s.charAt(i);
                charUsed[i]=1;
                permutations(s,position+1);
                charUsed[i]=0;
            }
        }

    }

}
