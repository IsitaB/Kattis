/*
Isita B
25 June 2019
Detailed Differences: Check for differences between two strings
If same print .
If different print *
*/

import java.util.*;

public class DetailedDifferences
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    int cases = console.nextInt();
    
    for(int i = 0; i < cases; i++)
    {
        String one = console.next();
        String two = console.next();
        String answer = "";
        
        for(int j = 0; j < one.length(); j++)
        {
            if(one.charAt(j) == two.charAt(j))
            {
                answer += (".");
            }
            else
            {
                answer += ("*");
            }
        }
        
        System.out.println(one + "\n" + two + "\n" + answer);
    }
   }
}
/*
Input:
3
ATCCGCTTAGAGGGATT
GTCCGTTTAGAAGGTTT
abcdefghijklmnopqrstuvwxyz
bcdefghijklmnopqrstuvwxyza
abcdefghijklmnopqrstuvwxyz0123456789
abcdefghijklmnopqrstuvwxyz0123456789
Output:
ATCCGCTTAGAGGGATT
GTCCGTTTAGAAGGTTT
*....*.....*..*..
abcdefghijklmnopqrstuvwxyz
bcdefghijklmnopqrstuvwxyza
**************************
abcdefghijklmnopqrstuvwxyz0123456789
abcdefghijklmnopqrstuvwxyz0123456789
....................................
 */
