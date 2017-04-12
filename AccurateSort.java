import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AccurateSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            boolean sorted = true;
            for(int i = 0; i < a.length - 1; i++)
            {
                if(a[i+1] < a[i])
                {
                    if(Math.abs(a[i] - a[i+1]) == 1)
                    {
                        int temp = a[i];
                        a[i] = a[i+1];
                        a[i+1] = temp;
                    }
                }
            }
            for(int i = 0; i < a.length - 1; i++)
            {
                if(a[i+1] < a[i])
                {
                    sorted = false;
                    break;
                }
            }
            if(sorted == false)
            {
                System.out.println("No");
            }
            if(sorted == true)
            {
                System.out.println("Yes");
            }
        }
    }
}
