package stacks;


import java.util.LinkedList;
import java.util.Stack;

public class ParanthesisMatching {


    public static void main(String[] args) {

        System.out.println("Is valid ? "+ isValidExpression("((a)(a))"));

        System.out.println("Is valid ? "+ isValidExpression("((a)(a)))"));

        System.out.println("Is valid ? "+ isValidExpression("((((a)(a)))"));


        System.out.println("Is valid ? "+ isValidExpressionRecursive("((a)(a))",0,0));

        System.out.println("Is valid ? "+ isValidExpressionRecursive("((a)(a)))",0,0));
        System.out.println("Is valid ? "+ isValidExpressionRecursive("(((a)(a))",0,0));


        System.out.println("Is valid ? "+ isValidExpressionMixed("[{}()]"));
        System.out.println("Is valid ? "+ isValidExpressionMixed("[[{}}()]"));




    }

    private static boolean isValidExpressionMixed(String s) {

        Stack<Character> st = new Stack<Character>();

        for(char c: s.toCharArray()) {

            if(c == '(' || c == '{' || c== '['){
                st.push(c);
            }else if(c == ')' || c == '}' || c== ']'){
                if(st.empty())return false;
                if(c == ')' && st.peek()!='(' ){
                    return false;
                }else if(c == '}' && st.peek()!='{' ){
                    return false;
                }else if(c == ']' && st.peek()!='[' ){
                    return false;
                }
                st.pop();
            }

        }

        return st.empty() ? true : false;
    }

    private static boolean isValidExpressionRecursive(String s,int index , int res) {

        if(index < s.length()) {
            if (s.charAt(index) == '(') {
               //return isValidExpressionRecursive(s, index + 1, res + 1);
                res++;
            } else if (s.charAt(index) == ')') {
                //return isValidExpressionRecursive(s, index + 1, res - 1);
                res--;
            }
           return isValidExpressionRecursive(s, ++index, res );

        }

        return index == s.length() && res ==0 ? true : false;

    }

    private static boolean isValidExpression(String s) {

        Stack<Character> st = new Stack<Character>();

        for(char c: s.toCharArray()) {

            if(c == '('){
                st.push(c);
            }else if(c == ')'){
                if(st.empty())return false;
                st.pop();
            }

        }

        return st.empty() ? true : false;



    }
}
