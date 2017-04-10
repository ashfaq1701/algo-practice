import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RoadsAndLibraries {

    public static long dfs(int node, Map<Integer, Set<Integer>> graph, boolean[] visited, long count)
    {
        visited[node] = true;
        Set<Integer> neighbors = graph.get(node);
        for(int adj : neighbors)
        {
            if(! visited[adj])
            {
                count = 1 + dfs(adj, graph, visited, count);
            }
        }
        return count;
    }
    
    public static long solution(int n, int m, long x, long y, Map<Integer, Set<Integer>> graph)
    {
        long cost = 0;
        boolean[] visited = new boolean[n + 1];
        for(int node = 1; node <= n; node++)
        {
            if(!visited[node])
            {
                long clusterSize = dfs(node, graph, visited, 1);
                cost += x;
                if(x > y)
                {
                    cost += ((clusterSize - 1) * y);
                }
                else
                {
                    cost += ((clusterSize - 1) * x);
                }
            }
        }
        return cost;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        long[] costs = new long[q];
        for(int a0 = 0; a0 < q; a0++) {
            int n = in.nextInt();
            int m = in.nextInt();
            long x = in.nextLong();
            long y = in.nextLong();
            Map<Integer, Set<Integer>> graph = new HashMap<Integer, Set<Integer>>();
            for(int i = 1; i <= n; i++)
            {
                graph.put(i, new HashSet<Integer>());
            }
            for(int i = 0; i < m; i++)
            {
                int u = in.nextInt();
                int v = in.nextInt();
                graph.get(u).add(v);
                graph.get(v).add(u);
            }
            costs[a0] = solution(n, m, x, y, graph);
        }
        
        for(int i = 0; i < q; i++)
        {
            System.out.println(costs[i]);
        }
    }
}