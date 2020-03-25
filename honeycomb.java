import java.util.Scanner;

public class honeycomb {
    public static void main(String[] args)
    {
        //n = steps in a walk
        //size of matrix is 2n + 1
        int size = 31;
        Scanner console = new Scanner(System.in);
        int[][][] comb = new int[size][size][size/2];
        comb[size/2][size/2][0] = 1;//base layer where n = 0, set center to 1
        //store honeycomb path distance values for each n value
        for(int z = 1; z <= 14; z++)
        {
            //process honeycomb
            //use previous walks information to calculate the number of different paths to that position
            for(int x = 1; x <= size; x++)
            {
                for(int y = 1; y <= size; y++)
                {
                    //cell's value is the sum of values of all six surrounding cells
                    try {
                        comb[x][y][z] += comb[x + 0][y + 1][z - 1];
                    }
                    catch (Exception e) {}
                    try {
                        comb[x][y][z] += comb[x + 1][y + 1][z - 1];
                        }
                    catch (Exception e) {}
                    try {
                        comb[x][y][z] += comb[x + 1][y + 0][z - 1];
                        }
                    catch (Exception e) {}
                    try {
                        comb[x][y][z] += comb[x + 0][y - 1][z - 1];
                        }
                    catch (Exception e) {}
                    try {
                        comb[x][y][z] += comb[x - 1][y - 1][z - 1];
                        }
                    catch (Exception e) {}      
                    try {
                        comb[x][y][z] += comb[x - 1][y + 0][z - 1];
                        }
                    catch (Exception e) {}              
                }
            }
        }

        int cases = console.nextInt();
        for(int i = 0; i < cases; i++)
        {
            int n = console.nextInt();
            System.out.println(comb[size/2][size/2][n]);
        }
    }
}
