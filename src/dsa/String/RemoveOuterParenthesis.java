package dsa.String;

import java.util.Stack;

public class RemoveOuterParenthesis {
    public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {

        }

        return s;
    }

    public static void main(String[] args) {
        String str="(()()(()))";

        removeOuterParentheses(str);
    }
}
