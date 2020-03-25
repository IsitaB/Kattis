/*
Isita B
Date: 29 June 2019
Project: Modulo
Description: Given two integers A and B, A modulo B is the remainder when 
dividing A by B. For example, the numbers 7, 14, 27 and 38 become 1, 2, 0 and 2, 
modulo 3. Write a program that accepts 10 numbers as input and outputs the 
number of distinct numbers in the input, if the numbers are considered modulo 42

Input
The input will contain 10 non-negative integers, each smaller than 1000, one 
per line.

Output
Output the number of distinct values when considered modulo 42 on a single line.

Explanation of Sample Inputs
In sample input 1, the numbers modulo 42 are 1,2,3,4,5,6,7,8,9 and 10.

In sample input 2, all numbers modulo 42 are 0.

In sample input 3, the numbers modulo 42 are 39,40,41,0,1,2,40,41,0 and 1. 
There are 6 distinct numbers.
*/

import java.util.*;

public class Modulo
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    int num = 0;
    
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    
    for(int i = 0; i < 10; i++)
    {
        num = console.nextInt();
        numeros.add(num % 42);
    }
    
    Collections.sort(numeros);
        int count = 10;
        
        for(int k = 1; k < count; k++)
        {
            if((numeros.get(k - 1)) == (numeros.get(k)))
            {
                numeros.remove(k - 1);
                k -= 1;
                count--;
            }
        }
        System.out.println(numeros.size());
   }
}

/*
Input:42
84
252
420
840
126
42
84
420
126
Output:
1
*/
