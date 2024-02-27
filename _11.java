import java.util.Random;
public class _11
{
    public static void main(String[] args)
    {
        Random random = new Random(100);
        for (int i = 0; i<100; i++)
        {
            System.out.print(" ,"+random.nextInt(49));
            if ((i +1)%10 == 0) 
            {
                System.out.println(" ");    
            }
        }
        
    }
}