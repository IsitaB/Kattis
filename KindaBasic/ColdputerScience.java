/*
Isita B
Date: 25 June 2019
Project: Coldputer Science
Description: take number of temperatures. Return number of temperatures that 
are under 0
*/
import java.util.*;

public class ColdputerScience
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    int cases = console.nextInt();
    int count = 0;
    
    //for each temp check if freezing
    //if freezing increment count
    for(int i = 0; i < cases; i++)
    {
        int temp = console.nextInt();
        if(temp < 0)
        {
            count++;
        }
    }
    System.out.println(count);
   }
}
/*
Input: 
3
5 -10 15
Output:
1
*/
