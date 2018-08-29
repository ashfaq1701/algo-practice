// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length;
        int[] sums = new int[n + 1];
        int minSliceIndex = 0;
        float minSliceAvg = Float.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            sums[i + 1] = sums[i] + A[i]; 
        }
        
        for (int i = 0; i < n - 1; i++) {
            int i0 = i;
            int i1 = i+1;
            float avg2 = (sums[i1 + 1] - sums[i0]) / 2.0f;
            if (avg2 < minSliceAvg) {
                minSliceAvg = avg2;
                minSliceIndex = i;
            }
            if (i < n - 2) {
                int i2 = i + 2;
                float avg3 = (sums[i2 + 1] - sums[i0]) / 3.0f;
                if (avg3 < minSliceAvg) {
                    minSliceAvg = avg3;
                    minSliceIndex = i;
                }
            }
        }
        return minSliceIndex;
    }
}
