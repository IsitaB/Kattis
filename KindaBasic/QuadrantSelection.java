/*
Isita B
23 June 2019
Quadrant Selection: Determine quadrant given x and y coordinates
*/

import java.util.*;

public class QuadrantSelection
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    int x = console.nextInt();
    int y = console.nextInt();
    
    int quad = 0;
    
    if((x > 0) && (y > 0))
    {
        quad = 1;
    }
    else if((x > 0) && (y < 0))
    {
        quad = 4;
    }
    else if((x < 0) && (y < 0))
    {
        quad = 3;
    }
    else if((x < 0) && (y > 0))
    {
        quad = 2;
    }
    
    System.out.println(quad);
   }
}
/*
Input:
10
6
Output:
1
 */
