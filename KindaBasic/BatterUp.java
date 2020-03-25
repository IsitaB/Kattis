/*
Isita B
Date: 25 June 2019
Project: Batter Up
Description: Input
The input is composed of two lines. The first line contains a single positive 
integer n that specifies the number of at bats. The second line contains n 
integers, separated by spaces, each describing one of those at-bats. 
Strike-outs, singles, doubles, triples, and home runs are represented as 0, 1, 
2, 3, 4, respectively. Walks are represented as -1. You may assume that there 
will always be at least one official at-bat

Output
Display the player's slugging percentage as a real number, accurate to within 
an absolute or relative error of 10-3. We recommend that you do not round the 
value that you calculate.
*/
import java.util.*;

public class BatterUp
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    int atBats = console.nextInt();
    double total = 0.0;
    int count = 0;
    
    for(int i = 0; i < atBats; i++)
    {
        int type = console.nextInt();
        if(type != -1)
        {
            count++;
            total += type;
        }
    }
    
    System.out.println(total/count);
   }
}
/*
Input: 3
3 0 2
Output:
1.6666666666666667
*/
