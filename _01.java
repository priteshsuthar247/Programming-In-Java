import java.util.Scanner;
public class _01
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        float a,b,c,d,e,f,x,y;
        System.out.print("Enter A: ");
        a = scan1.nextFloat();
        System.out.print("Enter B: ");
        b = scan1.nextFloat();
        System.out.print("Enter C: ");
        c = scan1.nextFloat();
        System.out.print("Enter D: ");
        d = scan1.nextFloat();
        System.out.print("Enter E: ");
        e = scan1.nextFloat();
        System.out.print("Enter F: ");
        f = scan1.nextFloat();
        scan1.close();
        if ((a*d)-(b*c) == 0) 
        {
            System.out.println("The equation has no solution");  
        }
        else
        {
            x = (e*d - b*f)/(a*d - b*c);
            y = (a*f - e*c)/(a*d -b*c);
            System.out.println("X= "+x);
            System.out.println("Y= "+y);
        }
    }
}