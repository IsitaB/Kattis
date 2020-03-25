/*
Isita B
Date: 28 June 2019
Project: Simon Says
Description: For each line that begins with precisely "Simon says", output the 
rest of the line. Each line that does not begin with precisely "Simon says" 
should be ignored.
*/
import java.util.*;
public class SimonSays
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int cases = console.nextInt();
        String sentence = "";
        
        for(int i = 0; i <= cases; i++)
        {
            sentence = console.nextLine();
            
            if(sentence.startsWith("Simon says"))
            {
                //starting from index 11
                System.out.println(sentence.substring(11, sentence.length()));
            }
        }
    }
}
/*
Input:
3
Raise your right hand.
Lower your right hand.
Simon says raise your left hand.
Output:
raise your left hand
*/
