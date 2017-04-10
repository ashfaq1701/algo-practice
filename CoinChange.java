import java.io.*;
import java.util.*;

public class CoinChange {
    public static long solution(int[] s, int m, int n)
    {
        long[] table = new long[n + 1];
        
        Arrays.fill(table, 0);
        table[0] = 1;
        
        for(int i = 0; i < m; i++)
        {
            for(int j = s[i]; j <= n; j++)
            {
                table[j] += table[j - s[i]];
            }
        }
        return table[n];
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] s = new int[m];
        for(int i = 0; i < m; i++)
        {
            s[i] = in.nextInt();
        }
        long ways = solution(s, m, n);
        System.out.println(ways);
    }
}