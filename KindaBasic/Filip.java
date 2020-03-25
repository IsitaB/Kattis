/*
Isita B
25 June 2019
Filip: Mirko has a younger brother, Filip, who just started going to school and 
is having trouble with numbers. To help him get the hang for number scale, his 
teacher writes two three-digit numbers. She asks Filip to compare those numbers, 
but instead of interpreting them with the leftmost most significant digit, he 
needs to interpret them the other way around, with the most significant digit 
being the rightmost one. He than has to tell the teacher the larger of the two 
numbers.

Write a program that will check Filip's answers.

Input
The first and only line of input contains two three-digit numbers, A and B. A 
and B will not be equal and will not contain any zeroes.

Output
The first and only line of output should contain the larger of the numbers in 
the input, compared as described in the task. The number should be written 
reversed, to display to Filip how he should read it.
*/

import java.util.*;
import java.lang.*;

public class Filip
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    //get numbers in string form 
    //reverse them in for loops
    //convert reversed string to integers
    String a = console.next();
    
    String reverseA = "";
    
    for(int i = a.length() - 1; i >= 0; i--)
    {
        reverseA += a.substring(i, i + 1);
    }
    int aReverse = java.lang.Integer.parseInt(reverseA);
    
    String b = console.next();
    String reverseB = "";
    for(int i = b.length() - 1; i >= 0; i--)
    {
        reverseB += b.substring(i, i + 1);
    }
    int bReverse = java.lang.Integer.parseInt(reverseB);

    //compare reversed integers
    if(aReverse > bReverse)
    {
        System.out.println(reverseA);
    }
    else
    {
        System.out.println(reverseB);
    }
   }
}
/*
Input:
234 456
Output:
654
 */
