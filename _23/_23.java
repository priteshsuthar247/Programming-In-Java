class circle
{
    double rad;
    final double pi = 3.14;
    circle(double rad)
    {
        this.rad=rad;
        double area = pi*rad*rad;
        System.out.println("Area of Circle: "+area);
    }
    circle(int rad)
    {
        this.rad=rad;
        double area = pi*rad*rad;
        System.out.println("Area of Circle: "+area);
    }
}
public class _23
{
    public static void main(String[] args)
    {
        new circle(25.63);
        new circle(35);
    }
}