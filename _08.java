import java.util.Scanner;
public class _08
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter: ");
        String str = scan1.nextLine();
        for (int i=0; i<str.length(); i++)
        {
            if (i != ' ') 
            {
                if (str.charAt(i) >= 60 && str.charAt(i) <= 90) 
                {
                    count++;
                }
            }
        }
        System.out.println(str+ " has "+count+" words which starts with capital letters.");
        scan1.close();
    }
}