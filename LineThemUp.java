import java.util.*;

public class LineThemUp {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int cases = console.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> newArr = new ArrayList<>();
        for(int i = 0; i < cases; i++)
        {
            String x = console.next();
            arr.add(x);
            newArr.add(x);
        }
        Collections.sort(newArr);
        
        ArrayList<String> desc = new ArrayList<String>();
        int j = cases - 1;
        for(String n : newArr)
        {
            desc.add(newArr.get(j));
            j--;
        }
        
        if(arr.equals(newArr))
            System.out.println("INCREASING");
        
        else if(arr.equals(desc))
            System.out.println("DECREASING");
        else
            System.out.println("NEITHER");
    }
}
