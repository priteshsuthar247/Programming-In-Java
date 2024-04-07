import java.util.*;
public class _16
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        int[] a,b; 
        int inp;
        a = new int[10];
        b = new int[10];
        System.out.print("Enter: ");
        for(int i = 0; i<10; i++)
        {
            inp = scan1.nextInt();
            a[i] = inp;
        }
        System.out.print("Reversed: ");
        for(int i = 0; i<10; i++)
        {
            b[i] = a[10 - i - 1];
        }
        for(int i = 0; i<10; i++)
        System.out.print(b[i]+" ");
        scan1.close();
    }
}