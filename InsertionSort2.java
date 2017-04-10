import java.io.*;
import java.util.*;

public class InsertionSort2 {

    public static void insertionSortPart2(int[] ar)
    {       
        for(int i = 0; i < ar.length - 1; i++)
        {
            int last = ar[i + 1];
            boolean placed = false;
            for(int j = i; j >= 0; j--)
            {
                if(ar[j] > last)
                {
                    ar[j + 1] = ar[j];
                }
                else
                {
                    ar[j+1] = last;
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
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}