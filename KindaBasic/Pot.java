/*
Isita B
24 June 2019
Pot:Write a program that will determine and output the value of X

X=numberpow11+numberpow22+·+numberpowNN
and it holds that number1, number2 to numberN are integers, and pow1, pow2 to 
powN are one-digit integers.· Unfortunately, when the teacher downloaded the 
task to her computer, the text formatting was lost so the task transformed into 
a sum of N integers:

X=P1+P2+PN
For example, without text formatting, the original task in the form of 
X=212+1253 became a task in the form of X=212+1253. Help the teacher by writing 
a program that will, for given N integers from P1 to PN determine and output the 
value of X from the original task.

Input
The first line of input contains the integer N, the number of the 
addends from the task. Each of the following N lines contains the integer Pi 
from the task.

Output
The first and only line of output must contain the value of X  from the original 
task.
*/

import java.util.*;

public class Pot
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    int num = console.nextInt();
    //initialize
    int total = 0;
    
    for(int i = 0; i < num; i++)
    {
        int getNum = console.nextInt();
        int base = getNum / 10;
        int power = getNum % 10;
        
        total += Math.pow(base, power);
    }
    
    System.out.println(total);
   }
}
/*
Input:
2
212
1253
Output:
1953566
 */
