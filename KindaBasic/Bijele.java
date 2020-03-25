/*
Isita B
23 June 2019
Biejele: chess pieces
Mirko has found an old chessboard and a set of pieces in his attic. 
Unfortunately, the set contains only white pieces, and apparently an incorrect 
number of them. A set of pieces should contain:One king One queen Two rooks Two
bishops Two knights Eight pawns Mirko would like to know how many pieces of each
 type he should add or remove to make a valid set.
*/
import java.util.Scanner;

public class Bijele
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    int[] ideal = {1,1,2,2,2,8};
    
    int[] actual = new int[6];
    //populate actual by storing user input
    for(int i = 0; i < 6; i++)
    {
        actual[i] = console.nextInt();
    }
    
    //return changes required for actual to match ideal
    int[] changes = new int[6];
    for(int j = 0; j < 6; j++)
    {
        changes[j] = ideal[j] - actual[j];
    }
    
    for(int n : changes)
    {
        System.out.print(n + " ");
    }
   }
}
