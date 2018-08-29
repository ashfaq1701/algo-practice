// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[][] genoms = new int[3][S.length() + 1];
        int[] result = new int[P.length];
        int a, c, g;
        for (int i = 0; i < S.length(); i++) {
            a = 0; c = 0; g = 0;
            char ch = S.charAt(i);
            if (ch == 'A') {
                a = 1;
            } else if (ch == 'C') {
                c = 1;
            } else if (ch == 'G') {
                g = 1;
            }
            genoms[0][i + 1] = genoms[0][i] + a;
            genoms[1][i + 1] = genoms[1][i] + c;
            genoms[2][i + 1] = genoms[2][i] + g;
        }
        for (int i = 0; i < P.length; i++) {
            int fromIdx = P[i];
            int toIdx = Q[i] + 1;
            if (genoms[0][toIdx] > genoms[0][fromIdx]) {
                result[i] = 1;
            }
            else if (genoms[1][toIdx] > genoms[1][fromIdx]) {
                result[i] = 2;
            }
            else if (genoms[2][toIdx] > genoms[2][fromIdx]) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }
        return result;
    }
}
