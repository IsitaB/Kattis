/*
Isita B
Date: 25 June 2019
Project: Alphabet Spam
Description: The input consists of:

one line with a string consisting of at least 1 and at most 100000 characters.

A preprocessing step has already transformed all whitespace characters to 
underscores (_), and the line will consist solely of characters with ASCII codes 
between 33 and 126 (inclusive).

Output
Output four lines, containing the ratios of whitespace characters, lowercase 
letters, uppercase letters, and symbols (in that order). Your answer should 
have an absolute or relative error of at most 10-6.
*/

import java.util.*;

public class AlphabetSpam
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
   
    String scam = console.next();
    int whitespace = 0;
    int lower = 0;
    int upper = 0;
    int symbol = 0;
    
    for(int i = 0; i < scam.length(); i++)
    {
        char character = scam.charAt(i);
        int ascii = (int) character;
        
        if(ascii == 95)
        {
            whitespace++;//underscore
        }
        else if((ascii >= 65) && (ascii <= 90))
        {
            upper++;
        }
        else if(((ascii >= 97) && (ascii <= 122)))
        {
            lower++;
        }
        else
        {
            symbol++;
        }
    }
    
    double length = scam.length();
    
    System.out.println((whitespace/length) + "\n" +
            (lower/length) + "\n" +
            (upper/length) + "\n" +
            (symbol/length));
   }
}

/*
Input:
Welcome_NWERC_participants!
Output:
0.07407407407407407
0.6666666666666666
0.2222222222222222
0.037037037037037035
*/
