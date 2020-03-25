/*
Isita B
25 June 2019
FizzBuzz: Basically, this is how it works: you print the integers from 1 to N, 
replacing any of them divisible by X with Fizz or, if they are divisible by Y, 
with Buzz. If the number is divisible by both X and Y, you print FizzBuzz 
instead.

Check the samples for further clarification.

Input
Input contains a single test case. Each test case contains three integers on a 
single line, X, Y and N.

Output
Print integers from 1 to N in order, each on its own line, replacing the ones 
divisible by X with Fizz, the ones divisible by Y with Buzz and ones divisible 
by both X and Y with FizzBuzz.
*/

import java.util.*;

public class FizzBizz
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    int x = console.nextInt();
    int y = console.nextInt();
    
    int num = console.nextInt();
    
    for(int i = 1; i <= num; i++)
    {
        if((i % x == 0) && (i % y == 0))
        {
            System.out.println("FizzBuzz");
        }
        else if(i % x == 0)
        {
            System.out.println("Fizz");
        }
        else if(i % y == 0)
        {
            System.out.println("Buzz");
        }
        else
        {
            System.out.println(i);
        }
    }
   }
}
/*
Input:
2 3 7
Output:
1
Fizz
Buzz
Fizz
5
FizzBuzz
7
 */
