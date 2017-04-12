import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RoundingGrades {

    static int solve(int[] grades){
        // Complete this function
        for(int i = 0; i < grades.length; i++)
        {
            int grade = grades[i];
            if(grade >= 38)
            {
                double div = (double) grade / 5;
                int divRounded = (int) div;
                if(div > divRounded)
                {
                    if((((divRounded + 1) * 5) - grade) < 3)
                    {
                        grades[i] = (divRounded + 1) * 5;
                    }
                }
                
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        solve(grades);
        for(int i = 0; i < grades.length; i++)
        {
            System.out.println(grades[i]);
        }
    }
}