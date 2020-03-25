/*
Isita B
25 June 2019
Datum: Return day of week given day and month in 2009
*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Datum
{
   public static void main(String[] args) throws ParseException
   {
    Scanner console = new Scanner(System.in);
    
    int day = console.nextInt();
    int month = console.nextInt();
    String year = "2009";
    
    String date = day + "/" + month + "/" + year;
    SimpleDateFormat formatted = new SimpleDateFormat("dd/MM/yyyy");
    Date dato = formatted.parse(date);
    
    DateFormat formatted2 = new SimpleDateFormat("EEEE");
    String finalDay = formatted2.format(dato);
    
    System.out.println(finalDay);
   }
}
/*
Input:
17 1
Output:
Saturday
 */
