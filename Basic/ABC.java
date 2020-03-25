/*
Isita B
Date: 29 June 2019
Project: ABC
Description: Input
The first line contains the three positive integers A, B and C, not necessarily 
in that order. The three numbers will be less than or equal to 100.

The second line contains three uppercase letters A,B,C (with no spaces between 
them) representing the desired order.

Output
Output A, B and C in the desired order on a single line, separated by single 
spaces.
*/

import java.util.*;

public class ABC
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    int[] nums = new int[3];
    
    for(int i = 0; i < 3; i++)
    {
        nums[i] = console.nextInt();
    }
    
    int max = nums[0];
    int min = nums[0];
    for(int j = 1; j < 3; j++)
    {
        if(nums[j] > max)
            max = nums[j];
        
        if(nums[j] < min)
         min = nums[j];
    }
    
    int b = 0;
    //System.out.println("max " + max + " min " + min);
    for(int k = 0; k < 3; k++)
    {
        if((nums[k] != max) && (nums[k] != min))
        {
            b = nums[k];
        }   
    }
    
    String abc = console.next();
    for(int j = 0; j < 3; j++)
    {
        if(abc.charAt(j) == 'A')
        {
            System.out.print(min + " ");
        }
        else if(abc.charAt(j) == 'B')
        {
            System.out.print(b + " ");
        }
        else if(abc.charAt(j) == 'C')
            System.out.print(max + " ");
    }
   }
}

/*
Input:
1 5 3
ABC
Output:
1 3 5 
*/
