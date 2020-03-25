/*
Isita B
Date: 28 June 2019
Project: Apaxians
Description: Input
The input contains a single name. Each name contains only lowercase letters 
(a-z), no whitespace, a minimum length of 1 character, and a maximum length of 
250 characters.

Output
The output contains the compact version of the name: any time the same letter 
appears two or more times in sequence, it must be replaced by a single instance 
of that letter.
*/
import java.util.*;
public class Apaxians
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        String name = console.next();
        String newWord = "";
        
        for(int i = 1; i < name.length(); i++)
        {
            if(!(name.charAt(i - 1) == name.charAt(i)))
            {
                newWord += name.charAt(i - 1);
            }
        }
        System.out.println(newWord + name.charAt(name.length() - 1));
    }
}
/*
Input:
maaann
Output:
man
*/
