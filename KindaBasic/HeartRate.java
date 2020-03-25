/*
Isita B
24 June 2019
heart rate: given beats and seconds calculate bpm = (60 * beats) / seconds 
provide upper aand lower bound
interval can be calculated by 60/seconds
*/

import java.util.*;

public class HeartRate
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    int cases = console.nextInt();
    
    for(int i = 0; i < cases; i++)
    {
        int beats = console.nextInt();
        double seconds = console.nextDouble();
        
        double bpm = (60 * beats)/ seconds;
        double interval = 60/seconds;
        System.out.println(((bpm - interval) + " ")
                                    + (bpm + " ") 
                                    + (bpm + interval));
    }
   }
}
/*
Input:
2
6 5.0000
2 3.1222
Output:
60.0 72.0 84.0
19.217218627890592 38.434437255781184 57.65165588367178
 */
