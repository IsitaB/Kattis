/*
Isita B
24 June 2019
Pet: In the popular show Dinner for Five, five contestants compete in 
preparing culinary delights. Every evening one of them makes dinner and each of 
other four then grades it on a scale from 1 to 5. The number of points a 
contestant gets is equal to the sum of grades they got. The winner of the show 
is of course the contestant that gets the most points.

Write a program that determines the winner and how many points they got.

Input
Five lines, each containing 4 integers, the grades a contestant got. The 
contestants are numbered 1 to 5 in the order in which their grades were given.

Output
Output on a single line the winner's number and their points, separated by a 
space. The input data will guarantee that the solution is unique.
*/

import java.util.*;

public class Pet
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    int[][] scores = new int[5][4];
    
    for(int i = 0; i < scores.length; i++)
    {
        for(int j = 0; j < scores[i].length; j++)
        {
            scores[i][j] = console.nextInt();
        }
    }
    
    int[] sum = new int[5];
    
    for(int i = 0; i < scores.length; i++)
    {
        for(int j = 0; j < scores[i].length; j++)
        {
            sum[i] += scores[i][j];
        }
    }
    
    int max = 0;
    int index = 0;
    
    for(int i = 0; i < sum.length; i++)
    {
        if(sum[i] > max)
        {
            max = sum[i];
            index = i;
        }
    }
    
    System.out.println((index + 1) + " " + max);
   }
}
/*
Input:
5 4 4 5
5 4 4 4
5 5 4 4
5 5 5 4
4 4 4 5
Output:
4 19
 */
