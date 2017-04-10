import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String[] results = new String[t];
        for(int i = 0; i < t; i++)
        {
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++)
            {
                arr[j] = in.nextInt();
            }
            
            int[] cumSum = new int[n];
            int sum = 0;
            for(int j = 0; j < n; j++)
            {
                sum += arr[j];
                cumSum[j] = sum;
            }
            for(int j = 0; j < n; j++)
            {
                int leftSum = 0, rightSum = 0;
                if(j == 0)
                {
                    leftSum = 0;
                    rightSum = cumSum[n - 1] - cumSum[j];
                }
                else if(j == n - 1)
                {
                    leftSum = cumSum[j - 1];
                    rightSum = 0;
                }
                else
                {
                    leftSum = cumSum[j - 1];
                    rightSum = cumSum[n - 1] - cumSum[j];
                }
                if(leftSum == rightSum)
                {
                    results[i] = "YES";
                    break;
                }
                results[i] = "NO";
            }
        }
        for(int i = 0; i < results.length; i++)
        {
            System.out.println(results[i]);
        }
    }
}