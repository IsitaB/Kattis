/*
Isita B
23 June 2019
The Amazing Human Cannonball
given intial speed, angle, distance, min height, and max height
(include 1m safety margin from both walls)
return whether launch is safe or not
*/

import java.util.*;
import java.lang.*;

public class Cannonball
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int num = console.nextInt();//get total number of test cases
        
        String[] safety = new String[num];//store whether each case is safe or not
        
        for(int i = 0; i < num; i++)
        {
            //first
            double speed = console.nextDouble();//initial velocity
            
            double angleInDegrees = console.nextDouble();//launch angle
            //convert to radians 
            double angleInRadians = (angleInDegrees * Math.PI)/180;
            
            double distance = console.nextDouble();//distance or x1
            double minHeight = console.nextDouble();//minimum height h1
            double maxHeight = console.nextDouble();//maximum height h2
            double height = 0;//initialize
            double time = 0;//initialize
            
            //time at which the ball will reach the wall (horizontally)
            time = distance/(speed * (java.lang.Math.cos(angleInRadians)));
            
            //the height at said time
            height = ((-.5) * (9.81) * (Math.pow(time, 2))) 
                    + (speed * time * (java.lang.Math.sin(angleInRadians)));
        
            //add or subtract one for the 1m safety margin 
            if((height > (minHeight + 1)) && (height < (maxHeight - 1)))
            {
                safety[i] = "Safe";
            }
            else
            {
                safety[i] = "Not safe";
            }
        }
        
        //print out safe/not safe for all cases
        for(String n : safety)
        {
            System.out.println(n);
        }
    }
}

/*
Input
11
19 45 20 9 12
20 45 20 9 12
25 45 20 9 12
20 43 20 9 12
20 47.5 20 9 12
20 45 17 9 12
20 45 24 9 12
20 45 20 10 12
20 45 20 9 11
20 45 20 9.0 11.5
20 45 18.1 9 12

Output:
Not safe
Safe
Not safe
Not safe
Not safe
Not safe
Not safe
Not safe
Not safe
Safe
Safe
*/
