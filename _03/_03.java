import java.util.Scanner;
public class _03
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter: ");
        float m = scan1.nextFloat();
        double f = m * 3.28084;
        System.out.println(m+" metres is equal to " +f+" feet's");
        scan1.close();
    }
}