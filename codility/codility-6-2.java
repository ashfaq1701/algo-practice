// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int n = A.length;
        return Math.max(A[0] * A[1] * A[n - 1], A[n - 1] * A[n - 2] * A[n - 3]);
    }
}
