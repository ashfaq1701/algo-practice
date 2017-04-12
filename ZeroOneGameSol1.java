import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ZeroOneGameSol1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            ArrayList<Integer> sequence = new ArrayList<Integer>();
            for(int sequence_i=0; sequence_i < n; sequence_i++){
                sequence.add(in.nextInt());
            }
            int i = 0;
            while(true)
            {
                boolean moved = false;
                for(int j = 1; j < sequence.size() - 1; j++)
                {
                    if(sequence.get(j - 1) == 0 && sequence.get(j + 1) == 0)
                    {
                        sequence.remove(j);
                        moved = true;
                        break;
                    }
                }
                if(moved == true)
                {
                    i = (i == 0 ? 1 : 0);
                }
                else
                {
                    String name = (i == 0 ? "Bob" : "Alice");
                    System.out.println(name);
                    break;
                }
            }
            // If Alice wins, print 'Alice' on a new line; otherwise, print 'Bob'
        }
    }
}