import java.util.*;
//count up to input number, print out missing numbers
public class MissingNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cases = console.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer> ();
        boolean good = true;
        
        for(int i = 0; i < cases; i++)
        {
            arr.add(console.nextInt());
        }
        
        for(int j = 1; j <= arr.get(arr.size() -1); j++)
        {
            if(arr.indexOf(j) == -1) 
            {
                System.out.println(j);
                good = false;
            }   
        }
        
        if(good == true)
            System.out.println("good job");
        console.close();
    }
}
