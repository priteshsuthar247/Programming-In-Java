import java.util.*;
public class _18
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        int[] a;
        int inp, size, temp;
        System.out.print("Enter Size of Array: ");
        size = scan1.nextInt();
        a = new int[size];
        System.out.print("Array: ");
        for(int i=0; i<size; i++)
        {
            inp = scan1.nextInt();
            a[i] = inp;
        }
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a.length; j++) 
            {
                if (a[i]<a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Sorted: ");
        for (int i = 0; i < a.length; i++) 
        {
            System.out.print(a[i]+" ");
        }
        scan1.close();
    }
}