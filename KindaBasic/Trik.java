/*
Isita B
23 June 2019
Trik: Jealous of Mirko’s position as head of the village, Borko stormed into 
his tent and tried to demonstrate Mirko’s incompetence for leadership with a 
trick.
Borko puts three opaque cups onto the table next to each other (opening facing 
down) and a small ball under the leftmost cup. He then swaps two cups in one of 
three possible ways a number of times. Mirko has to tell which cup the ball 
ends up under.
Wise Mirko grins with his arms crossed while Borko struggles to move the cups 
faster and faster. What Borko does not know is that programmers in the back are
recording all his moves and will use a simple program to determine where the
ball is. Write that program.
*/
import java.util.*;

public class Trik
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        //cup with ball under is one
        //empty cup is zero
        int[] cups = {1,0,0};//game begins with the ball at the leftmost cup
        
        String swaps = console.next();
        
        int numOfSwaps = swaps.length();
        
        /*swap values of cups given the current letter, which signifies which
        cups to swap. This value signifies whether the cup has the ball or does 
        not*/
        for(int i = 0; i < numOfSwaps; i++)
        {
            if(swaps.charAt(i) == 'A')//swap values of first and second cups
            {
                int placeholder = cups[0];
                cups[0] = cups[1];
                cups[1] = placeholder;
            }
            else if(swaps.charAt(i) == 'B')//swap values of second and third cups
            {
                int placeholder = cups[1];
                cups[1] = cups[2];
                cups[2] = placeholder;
            }
            else// swap values of first and third cups
            {
                int placeholder = cups[0];
                cups[0] = cups[2];
                cups[2] = placeholder;
            }
        }
        
        for(int j = 0; j < cups.length; j++)//the cup under which the ball is
        {
            if(cups[j] == 1)
            {
                //add 1 bc index starts with 0 rather than 1
                System.out.println((j + 1));
            }
        }
    }
}
