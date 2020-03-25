import java.util.*;

public class NastyHacks
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        
        String[] out = new String[n];
        
        for(int i = 0; i < n; i++)
        {
            int r = console.nextInt();
            int e = console.nextInt();
            int c = console.nextInt();
            
            if((e - c) > r)
            {
                out[i] = ("Advertise");
            }
            else if((e - c) < r)
            {
                out[i] = ("Do not advertise");
            }
            else
            {
                out[i] = ("Does not matter");
            }
        }
        
        for(String s : out)
        {
            System.out.println(s);
        }
    }
}
