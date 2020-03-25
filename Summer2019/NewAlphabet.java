/*
Isita B
Date: 28 June 2019
Project: A New Alphabet
Description: Translate
*/
import java.util.*;
public class NewAlphabet
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
         
        String[] newListo = {"@", "8", "(", "|)", "3", "#", 
                                    "6", "[-]", "|", "_|", "|<", "1", 
                                    "[]\\/[]", "[]\\[]", "0", "|D", "(,)", "|Z", 
                                    "$", "\'][\'", "|_|", "\\/", "\\/\\/", "}{", 
                                    "`/", "2"};
      
        String phrase = console.nextLine();
        phrase = phrase.toLowerCase();
        int index = 0;
        char str;
        
        for(int i = 0; i < phrase.length(); i++)
        {
            str = phrase.charAt(i);
            int ascii = (int) str;
            if(!((ascii >= 97) && (ascii <= 122)))
            {
                System.out.print(str);
            }
            else
            {
                index = ascii - 97;
            System.out.print(newListo[index]);
            }
        }
    }
}
/*
Input:
All your base are belong to us.
Output:
@11 `/0|_||Z 8@$3 @|Z3 8310[]\[]6 ']['0 |_|$.
*/
