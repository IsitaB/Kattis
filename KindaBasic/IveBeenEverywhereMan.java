/*
Isita B
Date: 28 June 2019
Project: I've Been Everywhere, Man
Description: Input
The first line of input contains a single positive integer T<=50 indicating the 
number of test cases. The first line of each test case also contains a single 
positive integer n indicating the number of work trips Alice has taken so far. 
The following n lines describe these trips. The ith such line simply contains 
the name of the city Alice visited on her ith trip.

Alice's work only sends her to cities with simple names: city names only 
contain lowercase letters, have at least one letter, and do not contain spaces.

The number of trips is at most 100 and no city name contains more than 20 chars.

Output
For each test case, simply output a single line containing a single integer that 
is the number of distinct cities that Alice has visited on her work trips.
*/
import java.util.*;
public class IveBeenEverywhereMan
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        int cases = console.nextInt();
        
        for(int i = 0; i < cases; i++)
        {
            int numOfCities = console.nextInt();
            HashSet<String> cities = new HashSet<String>();
            String city;
            
            for(int j = 0; j < numOfCities; j++)
            {
                city = console.next();
                cities.add(city);
            }
            
            System.out.println(cities.size());
        }
    }
}
/*
Input:
2
7
saskatoon
toronto
winnipeg
toronto
vancouver
saskatoon
toronto
3
edmonton
edmonton
edmonton
Output:
4
1
*/
