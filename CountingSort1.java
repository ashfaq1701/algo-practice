import java.io.*;
import java.util.*;

public class CountingSort1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        int max = 0;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i <= max; i++)
        {
            map.put(i, 0);
        }
        for(int i = 0; i < n; i++)
        {
            int oldVal = map.get(arr[i]);
            map.put(arr[i], ++oldVal);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            System.out.print(entry.getValue()+" ");
        }
    }
}