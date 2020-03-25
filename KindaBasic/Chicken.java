/*
Isita B
Date: 29 June 2019
Project: One Chicken Per Person!
*/

import java.util.*;

public class Chicken
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    int needed = console.nextInt();
    int available = console.nextInt();
    
    int diff = available - needed;
    
    if(diff == 1)
    {
        System.out.println("Dr. Chaz will have 1 piece of chicken left over!");
    }
    else if(diff == -1)
    {
        System.out.println("Dr. Chaz needs 1 more piece of chicken!");
    }
    else if(available > needed)
    {
        System.out.println("Dr. Chaz will have " + diff + 
                " pieces of chicken left over!");
    }
    else
    {
        System.out.println("Dr. Chaz needs " + Math.abs(diff) + 
                " more pieces of chicken!");
    }
   }
}

/*
Input:
2 3
Output:
Dr. Chaz will have 1 pieces of chicken left over!
*/
