interface shape2d
{
    double area();
}
interface shape3d
{
    double area();
}
abstract class shape
{
    public abstract void display();
}
class circle extends shape implements shape2d
{
    double rad;
    circle(double r)
    {
        rad=r;
    }
    public double area()
    {
        return (Math.PI * Math.pow(rad, 2));
    }
    public void display()
    {
        System.out.println("Area of circle: "+area());
    }
}
class sphere extends shape implements shape3d
{
    double rad;
    sphere(double r)
    {
        rad=r;
    }
    public double area()
    {
        return ((4.0/3.0) * Math.PI * Math.pow(rad, 3));
    }
    public void display()
    {
        System.out.println("Volume of sphere: "+area());
    }
}
public class _28
{
    public static void main(String[] args)
    {
        circle c1 = new circle(3.5);
        c1.display();
        sphere s1 = new sphere(5);
        s1.display();
    }
}
