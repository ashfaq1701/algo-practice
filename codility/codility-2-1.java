class Solution {
    public int[] solution(int[] A, int K) {
        if (A == null)
            return null;

        int n = A.length;

        int[] sol = new int[n];

        for (int i = 0; i < A.length; i++) {
            sol[(i + K) % n] = A[i];
        }

        return sol;
    }
}
