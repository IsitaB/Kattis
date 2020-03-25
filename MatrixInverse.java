import java.util.Scanner;

public class MatrixInverse 
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int i = 0;
        while(console.hasNextInt())
        {
            i+=1;
            int a = console.nextInt();
            int b = console.nextInt();
            int c = console.nextInt();
            int d = console.nextInt();
            
            int div = 1/((a*d)-(b*c));
            
            String res = "Case " + i + ":\n" + (div * d) + " " + (-1 * b * div) +
                    "\n" + (-1 * c * div) +" " +(div * a);
            System.out.println(res);
            
        }
    }
}
