import java.util.*;

public class HissingMicrophone
{
   public static void main(String[] args)
   {
    //get word
    Scanner console = new Scanner(System.in);
    String word = console.next();
    
    boolean hiss = false;//initialize
    
    //check for two consecutive 's' characters
    for(int i = 1; i < word.length(); i++)
    {
        if((word.charAt(i - 1) == 's') && (word.charAt(i) == 's'))
        {
            hiss = true;
            break;
        }
        else
            hiss = false;
    }
    
    //print result
    if(hiss == true)
    {
        System.out.println("hiss");
    }
    else if(hiss == false)
    {
        System.out.println("no hiss");
    }
   }
}
