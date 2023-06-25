package Leet;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "{[]}";
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty())
                    System.out.println("false");
                else if (stack.peek() == '[' && c == ']') {
                    stack.pop();
                } else if (stack.peek() == '(' && c == ')') {
                    stack.pop();
                } else if (stack.peek() == '{' && c == '}') {
                    stack.pop();
                }
                else {
                    System.out.println("false");
                }
            }
        }
        if(stack.empty())
            System.out.println("true");
    }
}
