import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCandle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        Map<Integer, Integer> nums = new HashMap<Integer, Integer>();
        for(int i=0; i < n; i++){
            height[i] = in.nextInt();
            if(nums.get(height[i]) == null)
            {
                nums.put(height[i], 1);
            }
            else
            {
                int oldHeight = nums.get(height[i]);
                nums.put(height[i], ++oldHeight);
            }
        }
        for(int i = 0; i < height.length - 1; i++)
        {
            if(height[i] > height[i + 1])
            {
                int temp = height[i];
                height[i] = height[i+1];
                height[i+1] = temp;
            }
        }
        int max = height[height.length - 1];
        System.out.println(nums.get(max));
    }
}