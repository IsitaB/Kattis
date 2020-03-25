/*
Isita B
23 June 2019
Autori: Abbreviates
*/
import java.util.*;

public class Autori
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String in = console.next();
        
        String abrev = in.substring(0, 1);//get first letter of string
        
        //use for loop to get first letter after each hyphen
        for(int i = 1; i < in.length(); i++)
        {
            if(in.charAt(i) == '-')
            {
                //keep adding these letters to first letter
                abrev += in.substring(i + 1, i + 2);
            }
        }
        System.out.println(abrev);
    }
}
/*
Sample Input: Knuth-Morris-Pratt
Output: KMP
*/
