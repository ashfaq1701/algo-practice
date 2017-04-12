import java.io.*;
import java.util.*;

public class CountingSort4 {
    
    private static <K, V> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Object>() {
            @SuppressWarnings("unchecked")
            public int compare(Object o1, Object o2) {
                return ((Comparable<V>) ((Map.Entry<K, V>) (o1)).getValue()).compareTo(((Map.Entry<K, V>) (o2)).getValue());
            }
        });

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Integer> keyMap = new HashMap<Integer, Integer>();
        Map<Integer, String> valMap = new HashMap<Integer, String>();
        String[] strs = new String[n];
        for(int i = 0; i < n; i++)
        {
            int key = in.nextInt();
            String str = in.nextLine();
            String val = "-";
            if(i >= n / 2)
            {
                val = str.trim();
            }
            
            keyMap.put(i, key);
            valMap.put(i, val);
        }
        
        Map<Integer, Integer> sortedMap = sortByValue(keyMap);
        
        for(Map.Entry<Integer, Integer> entry : sortedMap.entrySet())
        {
            int k = entry.getKey();
            int v = entry.getValue();
            System.out.print(valMap.get(k)+" ");
        }
    }
}