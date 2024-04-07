import java.util.Random;
public class _12
{
    public static void main(String[] args)
    {
        Random generate = new Random();
        for (int i = 0; i < 3; i++)
        {
            char c = (char) ('A' + generate.nextInt(26));
            System.out.print(c);
        }
        int num = generate.nextInt(9999);
        if (num>=1000) 
        {
            System.out.println(" "+num);
        }
    }
}