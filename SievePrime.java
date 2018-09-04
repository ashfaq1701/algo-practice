import java.util.*;

class SievePrime {
        public ArrayList<Integer> generatePrimeNumbers(int n) {
                boolean[] flags = new boolean[n + 1];
                for (int i = 2; i < flags.length; i++) {
                        flags[i] = true;
                }
                for (int p = 2; p * p <= n; p++) {
                        if (flags[p] == true) {
                                for (int j = p; j * p <= n; j++) {
                                        flags[j * p] = false;
                                }
                        }
                }
                ArrayList<Integer> primes = new ArrayList<Integer>();
                for (int i = 2; i < flags.length; i++) {
                        if (flags[i] == true) {
                                primes.add(i);
                        }
                }
                return primes;
        }

        public static void main(String args[]) {
                int n = Integer.parseInt(args[0]);
                SievePrime sievePrime = new SievePrime();
                ArrayList<Integer> list = sievePrime.generatePrimeNumbers(n);
                for(int i : list) {
                        System.out.println(i);
                }
        }
}
