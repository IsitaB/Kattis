/*
Isita B
24 June 2019
Sibice
Young Mirko threw matches all over the floor of his room.

His mom did not like that and ordered him to put all the matches in a box. 
Mirko soon noticed that not all of the matches on the floor fit in the box, so 
he decided to take the matches that dont fit and throw them in the neighbour·s 
garbage, where his mom (hopefully) wont find them.

Help Mirko determine which of the matches fit in the box his mom gave him. A 
match fits in the box if its entire length can lie on the bottom of the box. Mirko examines the matches one by one.

Input
The first line of input contains an integer N , the number of matches 
on the floor, and two integers W and H, the dimensions of the box.

Each of the following N lines contains a single integer between 1 and 1000 
(inclusive), the length of one match.

Output
For each match, in the order they were given in the input, output on a separate 
line DA if the match fits in the box or NE if it does not
*/

import java.util.*;

public class Sibice
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    int matches = console.nextInt();
    int length = console.nextInt();
    int width = console.nextInt();
    
    String[] fit = new String[matches];
    
    for(int i = 0; i < matches; i++)
    {
        int actualLength = console.nextInt();
        if(actualLength <= 
                (Math.pow(((Math.pow(length, 2)) + (Math.pow(width, 2))), .5)))
        {
            fit[i] = ("DA");
        }
        else
        {
            fit[i] = ("NE");
        }
    }
    
    for(String n : fit)
    {
        System.out.println(n);
    }
   }
}
/*
Input:
4
5
6
7
Output:
DA
DA
DA
NE
NE
 */
