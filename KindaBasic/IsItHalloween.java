/*
Isita B
23 June 2019
IsItHalloween: 
print yup if halloween or christmas. else nope
*/

import java.util.*;

public class IsItHalloween
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    
    String month = console.next();
    int day = console.nextInt();
    
    if(((month.equals("OCT")) && (day == 31)) || 
            ((month.equals("DEC")) && (day == 25)))
        System.out.println("yup");
    else
        System.out.println("nope");
   }
}
/*
Input:
OCT 31
Output:
yup
 */
