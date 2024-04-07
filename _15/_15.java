import java.util.*;
public class _15
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        int a,b;
        System.out.print("Enter A: ");
        a = scan1.nextInt();
        System.out.print("Enter B: ");
        b = scan1.nextInt();
        System.out.println("GCD: "+gcd (a,b));
        scan1.close();
    }
    public static int gcd (int num1, int num2)
    {
        int result = 1;
        for(int i = 2; i <= num1 && i <= num2; i++)
        {
            if (num1 % i == 0 && num2 % i == 0) 
            {
                result = i;    
            }
        }
        return result;
    }
}