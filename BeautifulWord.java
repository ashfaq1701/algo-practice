import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulWord {

	public boolean isBeautiful(String w)
	{
		char[] chars = {'a', 'e', 'i', 'o', 'u', 'y'};
		boolean beautiful = true;
		for(int i = 0; i < w.length() - 1; i++)
		{
			if(new String(chars).indexOf(w.charAt(i)) >= 0)
			{
				if(new String(chars).indexOf(w.charAt(i + 1)) >= 0)
				{
					beautiful = false;
					break;
				}
			}
			if(w.charAt(i) == w.charAt(i + 1))
			{
				beautiful = false;
				break;
			}
		}
		return beautiful;
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w = in.next();
        
        BeautifulWord obj = new BeautifulWord();
        boolean result = obj.isBeautiful(w);
        
        if(result == true)
        {
        	System.out.println("Yes");
        }
        else
        {
        	System.out.println("No");
        }
    }
}