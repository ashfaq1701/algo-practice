// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                stack.push(')');
            } else if (S.charAt(i) == '{') {
                stack.push('}');
            } else if (S.charAt(i) == '[') {
                stack.push(']');
            } else if (S.charAt(i) == ')' || S.charAt(i) == '}' || S.charAt(i) == ']') {
                if (stack.size() == 0) {
                    return 0;
                } else {
                    if (stack.pop() != S.charAt(i)) {
                        return 0;
                    }
                }
            }
        }
        if (stack.size() != 0) return 0;
        return 1;
    }
}
