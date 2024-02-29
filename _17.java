import java.util.*;
public class _17
{
    public static void main(String[] args)
    {
        Random gen = new Random();
        int[][] a;
        a = new int[6][6];
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a.length; j++) 
            {
                a[i][j] = gen.nextInt(2);
            }
        }
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a.length; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        boolean oddOnRows = true;
        boolean oddOnCols = true;
        
        for (int i = 0; i < a.length; i++) 
        {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < a[i].length; j++) 
            {
                rowSum += a[i][j];
                colSum += a[j][i];
            }
            if (rowSum % 2 == 0) 
            {
                oddOnRows = false;
            }
            if (colSum % 2 == 0) 
            {
                oddOnCols = false;
            }
        }
        if (oddOnRows && oddOnCols) 
        {
            System.out.println("Every row and column has an odd number of 1's.");
        }
        else 
        {
            System.out.println("Not every row and column has an odd number of 1's.");
        }
    }
}