import java.util.*;
public class PachydermPeanutPacking {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        while(true)
        {
            int boxes = console.nextInt();
            if(boxes == 0)
                break;
            ArrayList<Double> boxCoords = new ArrayList<>();
            ArrayList<String> boxSize = new ArrayList<>();
            for(int i = 0; i < boxes; i++)
            {
                boxCoords.add(console.nextDouble());
                boxCoords.add(console.nextDouble());
                boxCoords.add(console.nextDouble());
                boxCoords.add(console.nextDouble());
                boxSize.add(console.next());
            }
            int peanuts = console.nextInt();
            ArrayList<Double> peanutCoords = new ArrayList<>();
            for(int j = 0; j < peanuts; j++)
            {
                double x = console.nextDouble();
                double y = console.nextDouble();
                String size = console.next();
                String output = size;
                boolean good = false;
                for(int k = 0; k < (boxes * 4); k +=4)
                {
                    double x1 = boxCoords.get(k);
                    double x2 = boxCoords.get(k + 2);
                    double y1 = boxCoords.get(k + 1);
                    double y2 = boxCoords.get(k + 3);
                    
                    
                    if(x1 <= x && x2 >= x && y1 <= y && y2 >= y)
                    {
                        good = true;
                        if(boxSize.get(k/4).equals(size))
                            output += " correct";
                        else
                            output += " " + boxSize.get(k/4);
                        break;
                    }
                }
                if(!good)
                    output += " floor";
                System.out.println(output);
            }
            System.out.println();
        }
    }
}
