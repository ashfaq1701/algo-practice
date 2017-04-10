import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSort1 {
    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        int last = ar[ar.length - 1];
        boolean placed = false;
        for(int i = ar.length - 2; i >= 0; i--)
        {
            if(ar[i] > last)
            {
                ar[i + 1] = ar[i];
                printArray(ar);
            }
            else
            {
                ar[i+1] = last;
                placed = true;
                printArray(ar);
                break;
            } 
        }
        if(placed == false)
        {
            ar[0] = last;
            printArray(ar);
        }
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}