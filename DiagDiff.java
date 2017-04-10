import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagD {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int firstDiagSum = 0;
        int secondDiagSum = 0;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                if(j == i)
                {
                    firstDiagSum += a[i][j];
                }
                if(j == a[i].length - i - 1)
                {
                    secondDiagSum += a[i][j];
                }
            }
        }
        int diff = Math.abs(firstDiagSum - secondDiagSum);
        System.out.println(diff);
    }
}