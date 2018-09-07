// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int[] solution(int N, int[] P, int[] Q) {
        boolean[] primes = new boolean[N + 1];
        for (int i = 2; i < primes.length; i++) {
            primes[i] = true;
        }
        
        for (int i = 2; i * i <= N; i++) {
            if (primes[i]) {
                for (int j = i; j * i <= N; j++) {
                    primes[j * i] = false;
                }
            }
        }
        
        int[] semiprimes = new int[N + 1];
        Arrays.fill(semiprimes, 0);
        for (int i = 2; i * i <= N; i++) {
            while (!primes[i]) {
                i++;
            }
            for (int j = i; j * i <= N; j++) {
                if (primes[j]) {
                    semiprimes[j * i] = 1;
                }
            } 
        }
        
        int[] prefix = new int[N + 1];
        Arrays.fill(prefix, 0);
        for (int i = 1; i <= N; i++) {
            prefix[i] = prefix[i - 1] + semiprimes[i];
        }
        /*
        // or
        for (int i = 0; i < N; i++) {
            prefix[i + 1] = prefix[i] + semiprimes[i+1];
        }
        */
        int[] results = new int[P.length];
        for (int i = 0; i < results.length; i++) {
            results[i] = prefix[Q[i]] - prefix[P[i] - 1];
        }
        return results;
    }
}
