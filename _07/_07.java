import java.util.Scanner;
public class _07
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter: ");
        String str = scan1.nextLine();
        scan1.close();
        System.out.println("The string is "+str.length()+" characters long.");
        System.out.print("The 2nd half of string is: ");
        for (int i = str.length()/2; i<str.length(); i++)
        {
            System.out.print(str.charAt(i));
        }
    }
}