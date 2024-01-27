import java.util.Scanner;
public class _06
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter: ");
        char a = scan1.next().charAt(0);
        scan1.close();
        if (a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' || 
            a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') 
        {
            System.out.println(a+" is a vowel.");    
        }
        else
        {
            System.out.println(a+" is a consonant.");
        }
    }
}