import java.util.Scanner;
public class _04
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter: ");
        int num = scan1.nextInt();
        scan1.close();
        int flag = 0;
        if (num == 0 || num == 1) 
        {
            flag = 1;
            System.out.println(num+" is not a Prime Number.");
        }
        for (int i = 2; i<num/2; i++)
        {
            if (num%i == 0) 
            {
                System.out.println(num+" is not a Prime Number.");
                flag = 1;
                break;
            }
        }
        if (flag == 0) 
        {
            System.out.println(num+" is a Prime Number.");
        }
    }
}