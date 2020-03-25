import java.util.Scanner;

public class BestCompression {

    public static void main(String[] args) 
    {
        Scanner console = new Scanner(System.in);
        
        long n = console.nextLong();
        long b = console.nextLong();
        
        if(n > Math.pow(2, b + 1) - 1)
            System.out.println("no");
        else
            System.out.println("yes");
    }
}
