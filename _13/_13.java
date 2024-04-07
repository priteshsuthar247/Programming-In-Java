import java.util.*;
public class _13 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter: ");
        String input = scanner.nextLine();
        Double num = Double.parseDouble(input);
        int count = 10;
        while (num % 1 != 0) 
        {
            num *= count;
            count *= 10;
        }
        int numerator = (int) Math.round(num);
        while (numerator % 10 == 0 && count > 1) 
        {
            numerator /= 10;
            count /= 10;
        }
        System.out.println(numerator + "/" + count);
        scanner.close();
    }
}