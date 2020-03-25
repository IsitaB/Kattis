/*
Isita B
Date: 25 June 2019
Project: Cryptographer's Conundrum
Description: 
Now Per has come up with a secret plan: every day he will erase one letter of 
the cipher text and replace it with a different letter, so that, in the end, the
whole text reads PerPerPerPerPerPerPer. Since Per will change one letter each 
day, he hopes that people will not notice.

Per would like to know how many days it will take to transform a given cipher 
text into a text only containing his name, assuming he substitutes one letter 
each day. You may assume that the length of the original cipher text is a 
multiple of 3.

For simplicity, you can ignore the case of the letters, and instead assume that 
all letters are upper-case.

Input
The first and only line of input contains the cipher text on the whiteboard. It 
consists of at most 300 upper-case characters, and its length is a multiple of3

Output
Output the number of days needed to change the cipher text to a string 
containing only Per's name.
*/

import java.util.*;

public class CryptographersConundrum
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    String word = console.next();
    int count = 0;
    
    /*Per will have to replace only the letters that do not contribute to
    writing his name
    for every group of three letters, make sure
    the first is P, the second is E, and the third is R
    if not, increment count
    count is the number of days it will take per to change the code entirely
    */
    for(int i = 0; i < word.length(); i++)
    {
        if((i + 1) % 3 == 1)
        {
            if(word.charAt(i) != 'P')
            {
                count++;
            }
        }
        else if((i + 1) % 3 == 2)
        {
            if(word.charAt(i) != 'E')
            {
                count++;
            }
        }
        else
        {
            if(word.charAt(i) != 'R')
            {
                count++;
            }
        }
    }
    
    System.out.println(count);
   }
}
/*
Input: SECRET
Output: 4
*/
