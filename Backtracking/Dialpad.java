package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Dialpad {

    static void keypad(int i, String digits, String[] map, String res, List<String> ans) {
        if (i == digits.length()) {
            ans.add(res);
            return;
        }

        char ch = digits.charAt(i);
        int num = ch - '0';
        String st = map[num];

        for (int j = 0; j < st.length(); j++) {
            keypad(i + 1, digits, map, res + st.charAt(j), ans);
        }
    }

    public static List<String> letterCombo(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return ans; // handle empty input
        String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        keypad(0, digits, map, "", ans);
        return ans;
    }

    public static void main(String[] args) {
        String input = "23";
        List<String> result = letterCombo(input);
            System.out.println(result);
    }     
}