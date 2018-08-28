// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        long n = A.length + 1;
        long sum = (n * (n + 1)) / 2;
        for (int i = 0; i < A.length; i++) {
            sum -= A[i];
        }
        return (int) sum;
    }
}
