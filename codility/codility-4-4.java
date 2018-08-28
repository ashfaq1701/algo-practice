// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> seen = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) seen.add(A[i]);
        }
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!seen.contains(i)) return i;
        }
        return 1;
    }
}
