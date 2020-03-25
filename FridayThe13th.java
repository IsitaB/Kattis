import java.util.*;
public class FridayThe13th {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int cases = console.nextInt();
        
        for(int i = 0; i < cases; i++)
        {
            //days and months in a year
            int days = console.nextInt();
            int months = console.nextInt();
            
            //int[] daysMonth = new int[months];
            //for each month check for friday the 13th
            int daysMonth = 0;
            int day = 0;
            int count = 0;
            for(int j = 0; j < months; j++)
            {
                daysMonth = console.nextInt();
                if(daysMonth > 12 && (day + 12) % 7 == 5)
                    count ++;
                day = (day + daysMonth) % 7;
            }
            System.out.println(count);
        }
    }
}
