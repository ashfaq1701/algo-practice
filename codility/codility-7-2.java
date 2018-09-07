// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        if (A.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<Integer>();
        int alive = A.length;
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) {
                stack.push(A[i]);
            } else if (B[i] == 0) {
                while (!stack.isEmpty()) {
                    if (stack.peek() > A[i]) {
                        alive--;
                        break;
                    } else if (stack.peek() < A[i]) {
                        alive--;
                        stack.pop();
                    }
                }
            }
        }
        return alive;
    }
}
