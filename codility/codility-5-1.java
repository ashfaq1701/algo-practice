// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int pair = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                count++;
            } else {
                pair += count;
                if (pair > 1000000000) {
                    return -1;
                }
            }
        }
        return pair;
    }
}
