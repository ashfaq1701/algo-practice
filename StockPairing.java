import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StockPairing {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        int pairs = 0;
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < c.length; i++)
        {
            if(map.get(c[i]) != null)
            {
                int existing = map.get(c[i]);
                map.put(c[i], ++existing);
            }
            else
            {
                map.put(c[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            int key = entry.getKey();
            int val = entry.getValue();
            if(val % 2 == 0)
            {
                pairs += (val / 2);
            }
            else
            {
                val = val - 1;
                pairs += (val / 2);
            }
        }
        
        System.out.println(pairs);
    }
}
