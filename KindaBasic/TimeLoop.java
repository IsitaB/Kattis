/*
Isita B
23 June 2019
Time Loop: Input
Input consists of a single integer N (1<=N<=100).

Output
Output the entire wizard's spell by counting from 1 to N, giving one number and 
Abracadabra per line.
*/

import java.util.*;

public class TimeLoop
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    int numOfDays = console.nextInt();
    
    for(int i = 1; i <= numOfDays; i++)
    {
        System.out.println(i + " Abracadabra");
    }
   }
}
/*
Input:
5
Output:
1 Abracadabra
2 Abracadabra
3 Abracadabra
4 Abracadabra
5 Abracadabra
 */
