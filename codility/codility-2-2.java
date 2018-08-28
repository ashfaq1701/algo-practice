// you can also use imports, for example:
// import java.util.*;
import java.util.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < A.length; i++) {
            if (map.get(new Integer(A[i])) == null) {
                map.put(new Integer(A[i]), 1);
            } else {
                map.put(new Integer(A[i]), map.get(new Integer(A[i])) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
