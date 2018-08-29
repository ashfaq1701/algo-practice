// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        if (A == 0) {
            return (B / K) + 1;
        } else {
            return (B / K) - ((A - 1) / K);
        }
    }
}
