// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        boolean[] flags = new boolean[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            if (A[i] > A.length) return 0;
            if (flags[A[i]] == true) return 0;
            flags[A[i]] = true;
        }
        return 1;
    }
}
