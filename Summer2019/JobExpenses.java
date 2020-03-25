import java.util.Scanner;

public class JobExpenses {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cases = console.nextInt();
        int amount = 0;

        boolean negative = false;
        for(int i = 0; i < cases; i++)
        {
            int num = console.nextInt();
            
            //amount += num;
            if(num < 0)
            {
                negative = true;
                amount += num;
            }
        }
        if(negative == true)
            System.out.println(Math.abs(amount));
        else
            System.out.println(0);
    }
}
