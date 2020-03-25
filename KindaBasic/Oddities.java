/*
Isita B
24 June 2019
Oddities: Give number of numbers to be tested. Print whether number is even or 
odd
*/

import java.util.*;

public class Oddities
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    int num = console.nextInt();
    
    for(int i = 1; i <= num; i++)
    {
        int numero = console.nextInt();
        if(numero % 2 == 0)
        {
            System.out.println(numero + " is even");
        }
        else
        {
            System.out.println(numero + " is odd");
        }
    }
   }
}
/*
Input:
3
10
9
-5
Output:
10 is even
9 is odd
-5 is odd
*/
