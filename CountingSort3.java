import java.io.*;
import java.util.*;

public class CountingSort3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        String[] strArr = new String[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
            String str = in.nextLine();
            strArr[i] = str.trim();
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i <= 99; i++)
        {
            map.put(i, 0);
        }
        for(int i = 0; i < n; i++)
        {
            int oldVal = map.get(arr[i]);
            int newVal = ++oldVal;
            map.put(arr[i], newVal);
        }
        int[] freq = new int[100];
        for(int i = 0; i <= 99; i++)
        {
            int sum = 0;
            for(int j = i; j >= 0; j--)
            {
                int curr = map.get(j);
                sum += curr;
            }
            freq[i] = sum;
        }
        for(int i = 0; i < 100; i++)
        {
            System.out.print(freq[i] + " ");
        }
    }
}