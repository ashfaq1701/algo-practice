import java.io.*;
import java.util.*;

public class Quicksort2 {

    public static ArrayList<Integer> quicksort(ArrayList<Integer> nums)
    {
        if(nums.size() <= 1)
        {
            return nums;
        }
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> equal = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        int pivot = 0;
        for(int i = pivot; i < nums.size(); i++)
        {
            if(nums.get(i) < nums.get(pivot))
            {
                left.add(nums.get(i));
            }
            else if(nums.get(i) == nums.get(pivot))
            {
                equal.add(nums.get(i));
            }
            else
            {
                right.add(nums.get(i));
            }
        }
        
        left = quicksort(left);
        equal = quicksort(equal);
        right = quicksort(right);
        
        left.addAll(equal);
        left.addAll(right);
        
        printArrayList(left);
        
        return left;
    }
    
    static void printArrayList(ArrayList<Integer> list)
    {
        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i = 0; i < n; i++)
        {
            nums.add(in.nextInt());
        }
        ArrayList<Integer> sol = quicksort(nums);
    }
}