/*
Isita B
Date: 27 June 2019
Project: Grass Seed Inc
Description: Given cost per square meter, number of lawns, and the width and length of
each, return total cost
*/
import java.util.*;

public class GrassSeedInc
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    double cost = console.nextDouble();
    int lawns = console.nextInt();
    
    double totalArea = 0.0;
    
    for(int i = 1; i <= lawns; i++)
    {
        double width = console.nextDouble();
        double length = console.nextDouble();
        
        totalArea += (width * length);
    }
    
    System.out.println(totalArea * cost);
   }
}

/*
Input:
0.75
2
2 3.333
3.41 4.567
Output:
16.6796025
*/
