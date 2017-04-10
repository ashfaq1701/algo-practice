import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ToTwentyFour {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        boolean isAM = false;
        if(time.contains("AM"))
        {
            isAM = true;
        }
        String[] parts = time.split(":");
        String hourPart = parts[0];
        int hour = Integer.parseInt(hourPart);
        if(isAM == true && hour == 12)
        {
            hour = 0;
        }
        else if(isAM == false)
        {
            if(hour != 12)
            {
                hour = hour + 12;
            }
        }
        String newHourPart = "";
        if(hour >= 10)
        {
            newHourPart = ""+hour;
        }
        else
        {
            newHourPart = "0"+hour;
        }
        time = time.replace(hourPart, newHourPart);
        time = time.replace("AM", "");
        time = time.replace("PM", "");
        System.out.println(time);
    }
}