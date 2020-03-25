/*
Isita B
Date: 1 July 2019
Project: Judging Moose
Description: When determining the age of a bull moose, the number of tines, 
extending from the main antlers, can be used. An older bull moose tends to have 
more tines than a younger moose. However, just counting the number of tines can 
be misleading, as a moose can break off the tines, for example when fighting 
with other moose. Therefore, a point system is used when describing the antlers 
of a bull moose.
The point system works like this: If the number of tines on the left side and 
the right side match, the moose is said to have the even sum of the number of 
points. So, an even 6 point moose, would have three tines on each side. If the 
moose has a different number of tines on the left and right side, the moose is 
said to have twice the highest number of tines, but it is odd. So an odd 10
point moose would have 5 tines on one side, and 4 or less tines on the other 
side.

Can you figure out how many points a moose has, given the number of tines on 
the left and right side?

Input
The input contains a single line with two integers l and r, where 0 l 20 is the
number of tines on the left, and 0 r 20 is the number of tines on the right.

Output
Output a single line describing the moose. For even pointed moose, output Even 
x where x is the points of the moose. For odd pointed moose, output Odd x where 
x is the points of the moose. If the moose has no tines, output Not a moose
*/

import java.util.*;

public class JudgingMoose
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
   
    int left = console.nextInt();
    int right = console.nextInt();
    int sum = left + right;
    
    if(sum == 0)
        System.out.println("Not a moose");
    else
    {
        int max = 0;
        // find max
        if(left > right)
            max = left;
        else if(left == right)
            max = right;
        else if(right > left)
            max = right;
        
        if(left == right)
        {
            System.out.println("Even " + (max * 2));
        }
        else
            System.out.println("Odd " + (max * 2));
    }
   }
}

/*
Input: 
2 3
Output:
Odd 6
*/
