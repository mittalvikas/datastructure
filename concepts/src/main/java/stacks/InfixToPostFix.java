package stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class InfixToPostFix {

    private static Map<Character,Integer> prefrenceMap = new HashMap();

    static{
        prefrenceMap.put('+',1);
        prefrenceMap.put('-',1);
        prefrenceMap.put('*',2);
        prefrenceMap.put('/',2);
    }
    public static void main(String[] args) {

        System.out.println("Post fix expression: " + convertToPostFix("a+b-c"));
        System.out.println("Post fix expression: " + convertToPostFix("a+b*c-d/e"));

        String s = convertToPostFix("1+2*3");
        System.out.println("Post fix Eveluation of " + s +" and value is :" +evaluate(s));


    }

    private static int evaluate(String postFix) {

        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0;i<postFix.length();i++){

            if(prefrenceMap.keySet().contains(postFix.charAt(i))){
                int y = stack.pop();
                int x = stack.pop();
                int result = compute(x,y,postFix.charAt(i));
                stack.push(result);
            }else{
                stack.push(postFix.charAt(i)-'0');
            }

        }
        return stack.peek();

    }

    private static int compute(int x, int y, char operation) {

        if(operation == '+'){
            return x+y;
        }else if(operation == '-'){
            return x - y;
        }else if(operation == '*'){
            return x * y;
        }else if(operation == '/'){
            return x / y;
        }
        return 0;
    }

    private static String convertToPostFix(String s) {
        StringBuilder postFix = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<s.length();i++){

            if(prefrenceMap.keySet().contains(s.charAt(i))){
                while (!stack.empty() && prefrenceMap.get(stack.peek())>= prefrenceMap.get(s.charAt(i))){
                    postFix.append(stack.pop());
                }
                stack.push(s.charAt(i));
            }else{
                postFix.append(s.charAt(i));
            }

        }
        while (!stack.empty()){
            postFix.append(stack.pop());
        }

        return postFix.toString();
    }


}
