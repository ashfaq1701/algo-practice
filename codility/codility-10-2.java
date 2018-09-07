class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int a = 0;
        int sqrt = (int) Math.sqrt(N);
        for (a = sqrt; a >= 1; a--) {
            if (N % a == 0) {
                break;
            }
        }
        return 2 * (a + (N / a));
    }
}
