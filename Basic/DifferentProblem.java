/*
Isita B
27 June 2019
Different Problem
Return absolute value of the difference between the two numbers
*/

import java.util.*;

public class DifferentProblem
{
   public static void main(String[] args)
   {
       Scanner console = new Scanner(System.in);
       long one = 0;
       long two = 0;

       while(console.hasNext())
       {
           one = console.nextLong();
           two = console.nextLong();

           System.out.println(Math.abs(two - one));
       }
   }
}
/*
Input:
10 12
71293781758123 72784
1 12345677654321
Output:
2
71293781685339
12345677654320
 */
