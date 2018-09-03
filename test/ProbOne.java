import java.util.*;

class ProbOne {
        public int getNextStart(boolean[] flags) {
                for (int i = 0; i < flags.length; i++) {
                        if (flags[i] == false) {
                         return i;
                        }
                }
                return -1;
        }

        public int solution (int[] arr) {
                boolean[] flags = new boolean[arr.length];
                Arrays.fill(flags, false);
                if (arr.length == 0) {
                        return 0;
                }
                int start = 0;
                int length = 0;
                int maxLength = 0;
                while (start != -1) {
                        flags[start] = true;
                        length = 1;
                        int i = arr[start];
                        while (true) {
                                flags[i] = true;
                                length++;
                                if (arr[i] == start) {
                                        maxLength = Math.max(length, maxLength);
                                        start = this.getNextStart(flags);
                                        break;
                                } else {
                                        i = arr[i];
                                }
                        }
                }
                return maxLength;
        }

        public static void main (String args[]) {
                int[] arr = {5, 7, 4, 1, 2, 3, 8, 0, 9, 6};
                ProbOne probOne = new ProbOne();
                int len = probOne.solution(arr);
                System.out.println(len);
        }
}
