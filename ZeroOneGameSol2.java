import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ZeroOneGameSol2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int[] sequence = new int[n];
            for(int sequence_i=0; sequence_i < n; sequence_i++){
                sequence[sequence_i] = in.nextInt();
            }
            int moves = 0;
            int oldmoves = 0;
            while(true)
            {
                for(int j = 1; j < sequence.length - 1; j++)
                {
                    int left = 1, right = 1;
                    while(sequence[j - left] == -1)
                    {
                        left++;
                    }
                    while(sequence[j + right] == -1)
                    {
                        right++;
                    }
                    if(sequence[j - left] == 0 && sequence[j + right] == 0 && sequence[j] != -1)
                    {
                        sequence[j] = -1;
                        moves++;
                    }
                }
                if(moves == oldmoves)
                {
                    break;
                }
                oldmoves = moves;
            }
            if(moves % 2 == 0)
            {
                System.out.println("Bob");
            }
            else
            {
                System.out.println("Alice");
            }
            // If Alice wins, print 'Alice' on a new line; otherwise, print 'Bob'
        }
    }
}