import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        long[] arr = {a, b, c, d, e};
        
        long minSum = 0;
        long maxSum = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            long sumExceptThis = 0;
            for(int j = 0; j < arr.length; j++)
            {
                if(j != i)
                {
                    sumExceptThis += arr[j];
                }
            }
            if(i == 0)
            {
                minSum = sumExceptThis;
                maxSum = sumExceptThis;
            }
            else
            {
                if(sumExceptThis < minSum)
                {
                    minSum = sumExceptThis;
                }
                if(sumExceptThis > maxSum)
                {
                    maxSum = sumExceptThis;
                }
            }
        }
        System.out.println(minSum+" "+maxSum);
    }
}
