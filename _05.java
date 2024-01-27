import java.util.Scanner;
public class _05
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = scan1.nextInt();
        System.out.print("Enter B: ");
        int b = scan1.nextInt();
        System.out.print("Enter C: ");
        int c = scan1.nextInt();
        scan1.close();
        if (a>b && a>c) 
        {
            System.out.println(a+" is greatest.");    
        }
        else if(b>a && b>c)
        {
            System.out.println(b+ " is greatest.");
        }
        else
        {
            System.out.println(c+ " is greatest.");
        }
    }
}