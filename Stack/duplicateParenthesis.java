package Stack;

import java.util.*;

public class duplicateParenthesis {

    static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // closing
            if (ch == ')') {
                int count = 0;
                while (s.pop() != '(')
                    count++;
                if (count < 1)
                    return true;
            } else
                s.push(ch);
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "(((a*b)))";
        String s2 = "(a+b)";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
    }
}
