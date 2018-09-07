public int solution(int N, int M) {
        int[] X = new int[N];
        int i = 0;
        int count = 0;
        while(X[i] == 0) {
            X[i] = 1;
            i = (i + M) % N;            
            count++;
        }
        return count;
}
