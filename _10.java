import java.util.Scanner;
public class _10
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter: ");
        String str = scan1.nextLine();
        scan1.close();
        for (int i=0; i<str.length(); i++)
        {
            for (int j=str.length()-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++ )
            {
                System.out.print(str.charAt(k)+" ");
            }
            System.out.println();
        }
    }
}