/*
Isita B
27 June 2019
Stand on Zanzibar
Zanzi Bar, the first turtle on Zanzibar, has one further activity: it keeps 
track of the number of turtles on the island. Every New Year's Day it counts 
the turtles, and writes the total number in a small booklet. After many years 
this booklet contains a non-decreasing sequence of integers, starting with one 
or more ones. 

One day Zanzi realizes that it could also be the case that turtles from abroad 
come to Zanzibar, by boat or plane. Now it wonders how many of the inhabitants 
were not born on Zanzibar. Unfortunately, it can only derive a lower bound from 
the sequence in the booklet. Indeed, if the number of turtles in a year is more 
than twice as big as the year before, the difference must be fully explained by 
import.

As soon as Zanzibar has 1000000 turtles, the island is totally covered with 
turtles, and both reproduction and import come to a halt. Please help Zanzi! 
Write a program that computes the lower bound of import turtles, given a 
sequence, as described above.

Input
The input starts with a line containing an integer T, the number of 
test cases. Then for each test case:

One line containing a sequence of space-separated, positive integers, 
non-decreasing, starting with one or more ones. For convenience, a single space 
and a 0 are appended to the end of the sequence.

Output
For each test case, output a line containing a single integer: the lower bound 
for the number of turtles not born on Zanzibar.
*/

import java.util.*;

public class Zanzibar
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    int cases = console.nextInt();
    int ori = 0;
    int next = 0;
    
    for(int i = 1; i <= cases; i++)
    {
        int additional = 0;
        ori = console.nextInt();
        next = console.nextInt();
        while(next != 0)
        {
            if(next > (ori * 2))
            {
                additional += (next - (ori * 2));
            }           
            ori = next;
            next = console.nextInt();
        }
        System.out.println(additional);
    }
    
   }
}
/*
Input:
3
1 100 0
1 1 1 2 2 4 8 8 9 0
1 28 72 0
Output:
98
0
42
 */
