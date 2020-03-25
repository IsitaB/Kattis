/*
Isita B
23 June 2019
Faktor
*/
import java.util.Scanner;

public class Faktor
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    int a = console.nextInt();//articles
    int i = console.nextInt();//impactFactor
    
    //formula i = citations/a
    //therefore: citations = i * a
    //Subtract 1 from i bc impact factor is always rounded up
    //add one to product to make up for prior subtraction
    int minScientists = ((i - 1) * (a)) + 1;
    System.out.println(minScientists);
   }
}
