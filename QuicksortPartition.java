import java.io.*;
import java.util.*;

public class QuicksortPartition {
    public static ArrayList<Integer> partition(int[] nums)
    {
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> equal = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();
        int pivot = 0;
        for(int i = pivot; i < nums.length; i++)
        {
            if(nums[i] < nums[pivot])
            {
                left.add(nums[i]);
            }
            else if(nums[i] == nums[pivot])
            {
                equal.add(nums[i]);
            }
            else
            {
                right.add(nums[i]);
            }
        }
        left.addAll(equal);
        left.addAll(right);
        return left;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++)
        {
            nums[i] = in.nextInt();
        }
        ArrayList<Integer> sol = partition(nums);
        for(int i : sol)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}