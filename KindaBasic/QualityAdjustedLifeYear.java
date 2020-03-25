/*
Isita B
24 June 2019
For periods of constant quality of life
Given quality of life and number of years in that period
print overall quality of life
*/

import java.util.*;

public class QualityAdjustedLifeYear
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    int periods = console.nextInt();
    double totalSum = 0.0;//initialize
    
    for(int i = 0; i < periods; i++)
    {
        double quality = console.nextDouble();
        double years = console.nextDouble();
        
        totalSum += (quality * years);
    }
    
    System.out.println(totalSum);
   }
}
