import java.util.Scanner;

public class Zipline 
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int cases = console.nextInt();
        
        for(int i = 0; i < cases; i++)
        {
            int w = console.nextInt();
            int g = console.nextInt();
            int h = console.nextInt();
            int r = console.nextInt();
            double min = 0;
            
            if(g == h)
                min = w;
            else
                min = Math.pow((Math.pow(w, 2)) + Math.pow(h - g, 2), 0.5);
            
            double a = g - r;
            double b = h - r;
            double v = 0;
            if(a + b != 0)
                v = (a * w)/(a + b);
            
            double lg = Math.pow(Math.pow(a, 2) + Math.pow(v, 2), 0.5);
            double lh = Math.pow(Math.pow(b, 2) + Math.pow(w - v, 2), 0.5);
            
            double max = lg + lh;
            
            System.out.printf("%.8f", min);
            System.out.print(" ");
            System.out.printf("%.8f", max);
            System.out.println();
        }
    }
}
