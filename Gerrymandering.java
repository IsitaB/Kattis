import java.util.*;

public class Gerrymandering 
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int p = console.nextInt();
        
        int d = console.nextInt();
        int[] polls = new int[3 * d];
        
        int aW = 0;
        int bW = 0;
        
        //populate
        for(int i = 0; i < p; i++)
        {
            int dis = console.nextInt();
            int aV = console.nextInt();
            int bV = console.nextInt();
            //int v = aV + bV;
            
            polls[3 * (dis - 1) + 1] += aV;
            polls[3 * (dis - 1) + 2] += bV;
        }
        
        int totalA = 0;
        int totalB = 0;
        double totalV = 0;
        
        for(int j = 0; j < d; j++)
        {
            int a = polls[(3 * j) + 1];
            int b = polls[(3 * j) + 2];
            //System.out.println(j + a + " " + b);
            
            int v = a + b;
            String win = "";
            
            if(a > b)
            {
                aW = (a - ((v/2)+1));
                bW = b;
                win = "A";
            }
            else
            {
                bW = (b - ((v/2)+1));
                aW = a;
                win = "B";
            }
            
            totalA += aW;
            totalB += bW;
            totalV += v;
            
            System.out.println(win + " " + aW + " " + bW);
        }
        System.out.printf("%.10f", (Math.abs(totalA - totalB))/totalV);
    }
}
