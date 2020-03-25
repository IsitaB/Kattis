/*
Isita B
23 June 2019
R2: given the average and one of two numbers, find the other number
*/

import java.util.*;

public class R2
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    int R1 = console.nextInt();
    int S = console.nextInt();
    
    int R2 = (2 * S) - R1;
    System.out.println(R2);
   }
}
/*
Input: 11 15
Output: 19
 */
