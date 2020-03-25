/*
Isita B
24 June 2019
Seven Wonders is a card drafting game in which players build structures to earn 
points. The player who ends with the most points wins. One winning strategy is 
to focus on building scientific structures. There are three types of scientific 
structure cards: Tablet (T), Compass (C), and Gear (G). For each type of 
cards, a player earns a number of points that is equal to the squared number of 
that type of cards played. Additionally, for each set of three different 
scientific cards, a player scores 7 points.
For example, if a player plays 3 Tablet cards, 2 Compass cards and 1 Gear card, 
she gets 32+22+12+7=21 points.

It might be tedious to calculate how many scientific points a player gets by the 
end of each game. Therefore, you are here to help write a program for the 
calculation to save everyone's time.

Input
The input has a single string with no more than 50 characters. The string 
contains only letters 'T', 'C' or 'G', which denote the scientific cards a 
player has played in a Seven Wonders game.

Output
Output the number of scientific points the player earns.

Note
Seven Wonders was created by Antoine Bauza, and published by Repos Production. 
Antoine Bauza and Repos Production do not endorse and have no involvement with 
the ProgNova contest.
*/

import java.util.*;
import java.lang.*;

public class SevenWonders
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    String cards = console.next();
    
    //initialize counters
    int tCount = 0;
    int cCount = 0;
    int gCount = 0;
    
    int sets = 0;
    
    for(int i = 0; i < cards.length(); i++)
    {
        if(cards.charAt(i) == 'T')
        {
            tCount++;
        }
        else if(cards.charAt(i) == 'C')
        {
            cCount++;
        }
        else if(cards.charAt(i) == 'G')
        {
            gCount++;
        }
    }
    
    if((tCount != cCount) || (cCount != gCount) || (gCount != tCount))
    {
        if(tCount <= cCount && tCount <= gCount)
            sets = tCount;
        else if(cCount <= gCount && cCount <= tCount)
            sets = cCount;
        else 
            sets = gCount;
    }
    else if(tCount == cCount && cCount == gCount)
    {
        sets = tCount;
    }
    
    double score = Math.pow(tCount, 2) + Math.pow(cCount, 2) 
                    + Math.pow(gCount, 2) + (sets * 7);
    
    System.out.println((int)(score));
   }
}
/*
Input:
TTCCGG
Output
26
 */
