import java.util.Scanner;
public class _02
{
    public static void main(String[] args)
    {
        Scanner scan1 = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Enter Weight (in pounds): ");
        weight = scan1.nextDouble();
        System.out.print("Enter Height (in inches): ");
        height = scan1.nextDouble();
        scan1.close();
        bmi = ((weight * 0.45359237)/((height * 0.0254)*(height * 0.0254)));
        System.out.println("Your BMI is "+bmi);
    }
}