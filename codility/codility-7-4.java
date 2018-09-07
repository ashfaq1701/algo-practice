// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] H) {
        // write your code in Java SE 8
        Stack<Integer> st = new Stack<Integer>();
        int numBlock = 0;
        for (int i = 0; i < H.length; i++) {
            while (st.isEmpty() == false && st.peek() > H[i]) {
                st.pop();
            } 
            if (st.isEmpty()) {
                st.push(H[i]);
                numBlock++;
            } else if (st.peek() < H[i]) {
                st.push(H[i]);
                numBlock++;
            }
        }
        return numBlock;
    }
}
