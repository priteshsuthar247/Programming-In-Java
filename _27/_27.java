abstract class a
{
    public abstract void display();
}
class a1 extends a
{
    public void display()
    {
        System.out.println("1");
    }
}
class a2 extends a
{
    public void display()
    {
        System.out.println("2");
    }
}
public class _27
{
    public static void main(String[] args)
    {
        a obj1 = new a1();
        a obj2 = new a2();
        obj1.display();
        obj2.display();
    }
}