// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : A) {
            set.add(i);
        }
        return set.size();
    }
}
