// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        int diff = Integer.MAX_VALUE;
        int left = 0;
        for (int i = 1; i < A.length; i++) {
            left += A[i - 1];
            int right = sum - left;
            diff = Math.min(diff, Math.abs(left - right));
        }
        return diff;
    }
}
