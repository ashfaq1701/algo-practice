// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int max = 0;
        int[] states = new int[N];
        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                for (int j = 0; j < states.length; j++) {
                    states[j] = max;
                }
            } else {
                states[A[i] - 1] = states[A[i] - 1] + 1;
                if (states[A[i] - 1] > max) {
                    max = states[A[i] - 1];                    
                }
            }
        }
        return states;
    }
}
