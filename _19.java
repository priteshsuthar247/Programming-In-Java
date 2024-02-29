import java.util.*;
public class _19
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        int[][] a,b,c;
        int inp;
        a = new int[3][3];
        b = new int[3][3];
        c = new int[3][3];
        System.out.print("A: ");
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[i].length; j++) 
            {
                inp = scan1.nextInt();
                a[i][j]= inp;
            }
        }
        System.out.println();
        System.out.print("B: ");
        for (int i = 0; i < b.length; i++) 
        {
            for (int j = 0; j < b[i].length; j++) 
            {
                inp = scan1.nextInt();
                b[i][j]= inp;
            }
        }
        System.out.println("Sum: ");
        for (int i = 0; i < c.length; i++) 
        {
            for (int j = 0; j < c[i].length; j++) 
            {
                c[i][j]= a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < c.length; i++) 
        {
            for (int j = 0; j < c[i].length; j++) 
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        scan1.close();
    }
}