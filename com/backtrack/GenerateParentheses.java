package com.backtrack;

public class GenerateParentheses {
    public GenerateParentheses() {
    }

    public static void main(String[] args) {
        int n = 3;
        generateParentheses(n, "", 0, 0, 0);
    }

    static void generateParentheses(int n, String cur, int i, int open, int close) {
        if (i == 2 * n) {
            System.out.println(cur);
        } else {
            if (open < n) {
                cur = cur + "(";
                generateParentheses(n, cur, i + 1, open + 1, close);
                cur = cur.substring(0, cur.length() - 1);
            }

            if (close < open) {
                cur = cur + ")";
                generateParentheses(n, cur, i + 1, open, close + 1);
            }

        }
    }
}
