/*
Isita Bagayatkar
Date: 27 August 2019
Project: Speed Limit
Description: Given speed and time spent at speed, calculate total
distance traveled. Accept input until input is -1. Prompt the number 
of data pairs
*/

import java.util.*;

public class SpeedLimit {
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        
        //initialize variables
        int count = 0;
        
        count = console.nextInt();
        
        while(count != -1)//works
        {
            int speed = 0;
            int hours = 0;
            int multHours = 0;
            int oriHours = 0;
            int total = 0;
            //store pairs
            for(int i = 0; i < count; i++)
            {
                speed = console.nextInt();
                
                oriHours = hours;
                hours = console.nextInt();
                multHours = hours - oriHours;//new minus original
                total += (speed * multHours);
            }
            System.out.println(total + " miles");
            
            //for next set
            count = console.nextInt();
        }
    }
}
/*
Input:
3
20 2
30 6
10 7
2
60 1
30 5
4
15 1
25 2
30 3
10 5
-1
Output:
170 miles
180 miles
90 miles
*/
