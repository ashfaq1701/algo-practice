import java.util.*;

class ProbOne1 {
        public int solution (int[] arr) {
                HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
                for (int i = 0; i < arr.length; i++) {
                        map.put(i, arr[i]);
                }

                int maxLength = 0;
                int idx = 0;
                int length = 0;
                while(map.size() > 0) {
                        Integer val = map.get(idx);
                        if (val != null) {
                                length++;
                                map.remove(idx);
                                idx = val;
                        } else {
                                maxLength = Math.max(length, maxLength);
                                length = 0;
                                idx = (int) map.keySet().toArray()[0];
                        }
                }
                return maxLength;
        }

        public static void main (String args[]) {
                int[] arr = {5, 7, 4, 1, 2, 3, 8, 0, 9, 6};
                ProbOne1 probOne = new ProbOne1();
                int len = probOne.solution(arr);
                System.out.println(len);
        }
}
