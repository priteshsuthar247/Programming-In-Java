import java.util.Scanner;
public class _14
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter: ");
        int a = scan1.nextInt();
        scan1.close();
        int count = 2;
        while (a>1)
        {   
            if (a%count==0) 
            {
                a = a/count;
                System.out.println(a+" "+count);
            }
            else
            {
                count++;
            }
        }
    }
}
