// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String str = Integer.toBinaryString(N);
        int max = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                count++;
            } else if (str.charAt(i) == '1') {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        return max;
    }
}
