/*
Isita B
24 June 2019
Ladder: You are attempting to climb up the roof to fix some leaks, and have to 
go buy a ladder. The ladder needs to reach to the top of the wall, which is h 
centimeters high, and in order to be steady enough for you to climb it, the 
ladder can be at an angle of at most v degrees from the ground. How long does 
the ladder have to be?

Input
The input consists of a single line containing two integers h and v, with 
meanings as described above.

Output
Write a single line containing the minimum possible length of the ladder in 
centimeters, rounded up to the nearest integer.
*/

import java.util.*;
import java.lang.*;

public class Ladder
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    int wallHeight = console.nextInt();
    double angleDegrees = console.nextDouble();
    
    double angleRadians = (angleDegrees * Math.PI)/ 180;//convert to radians
    
    //use trig to find hypotenuse, which is the ladder length
    int ladderLength = (int)(wallHeight/ (Math.sin(angleRadians))) + 1;
    
    System.out.println(ladderLength);
   }
}
/*
Input: 
500 70
Output:
533
 */
