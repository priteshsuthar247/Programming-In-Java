import java.util.Scanner;
public class _09
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        String newstr = "" , str;
        System.out.print("Enter: ");
        str = scan1.nextLine();
        scan1.close();
        for (int i = 0; i<str.length(); i++)
        {
            newstr = str.charAt(i)+newstr;
        }
        if (str.equals(newstr)) 
        {
            System.out.println(str+" is palindrome.");
        }
        else
        {
            System.out.println(str+" is not palindrome.");
        }
    }
}