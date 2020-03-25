/*
Isita B
Date: 25 June 2019
Project: Cetvrta
Description: Given 3 rectangle Points, print Points of 4th Point
*/
import java.awt.Point;
import java.util.*;

public class Cetvrta
{
   public static void main(String[] args)
   {
    Scanner console = new Scanner(System.in);
    ArrayList<Point> Points = new ArrayList<Point>();
    for(int i = 0; i < 3; i++)
    {
        int xco = console.nextInt();
        int yco = console.nextInt();
        
        Points.add(new Point(xco,yco));
    }
    
    Point other = new Point();
    Point result = new Point();
    int d1x = 0;
    int d1y = 0;
    int d2x = 0;
    int d2y = 0;
    Point option1 = new Point();
        Point option2 = new Point();
    
    if((Points.get(0).getX() != Points.get(1).getX())
            && (Points.get(0).getY() != Points.get(1).getY()))
    {
        other = Points.get(2);
        d1x = (int) Points.get(0).getX();
        d1y = (int) Points.get(0).getY();
        d2x = (int) Points.get(1).getX();
        d2y = (int) Points.get(1).getY();
        option1 = new Point(d1x,d2y);
        option2 = new Point(d2x,d1y);
    }
    else if ((Points.get(0).getX() != Points.get(2).getX())
            && (Points.get(0).getY() != Points.get(2).getY()))
    {
        other = Points.get(1);
        //Point other = new Point(Points.get(1).getX(),
                //  Points.get(1).getY());
        d1x = (int) Points.get(0).getX();
        d1y = (int) Points.get(0).getY();
        d2x = (int) Points.get(2).getX();
        d2y = (int) Points.get(2).getY();
        option1 = new Point(d1x,d2y);
        option2 = new Point(d2x,d1y);
    }
    else
    {
        other = Points.get(0);
        d1x = (int) Points.get(1).getX();
        d1y = (int) Points.get(1).getY();
        d2x = (int) Points.get(2).getX();
        d2y = (int) Points.get(2).getY();
        option1 = new Point(d1x,d2y);
        option2 = new Point(d2x,d1y);
    }
    
    if(option1.getX() == other.getX() && option1.getY() == other.getY())
        {
            result = new Point((int)option2.getX(),(int) option2.getY());
        }
    else
    {
            result = new Point((int)option1.getX(),(int) option1.getY());
        }
    
    System.out.print((int)result.getX() + " " + (int)result.getY());
   }
}

/*
Input: 
30 20
10 10
10 20
Output:
30 10
*/
