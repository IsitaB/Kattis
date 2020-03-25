/*
Isita B
23 June 2019
Spavanac: Subtract 45 minutes from 24 hour time notation
*/

import java.util.*;

public class Spavanac
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    int hours = console.nextInt();
    int minutes = console.nextInt();
    
    if(minutes >= 45)
    {
        System.out.println(hours + " " + (minutes - 45));
    }
    else if((minutes <= 45) && (hours != 0)) 
    {
        System.out.println((hours - 1) + " " + ((minutes + 60) - 45));
    }
    else if((minutes <= 45) && (hours == 0)) 
    {
        System.out.println(("23 ") + ((minutes + 60) - 45));
    }
   }
}
/*
Input:
23 40
Output:
22 55
*/
