import java.util.*;

//all events squared
//scan from front and back

//for i in range length
//second for loop check from back
//every time letter not in set, increment count

public class SummerTrip {
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        
        //initialize variables
        
        String str = console.next();
        int count = 0;
        
        for(int i = 0; i < str.length(); i++)
        {
            HashSet<Character> hash = new HashSet<Character>();
            char starter = str.charAt(i);
            for(int j = i+1; j < str.length(); j++)
            {
                if(str.charAt(j) == starter)
                {
                    break;
                }
                if(hash.add(str.charAt(j)))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
