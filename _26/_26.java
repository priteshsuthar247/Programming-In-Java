class vehicle
{
    int NoOfWheels;
    vehicle(int num)
    {
        NoOfWheels=num;
    }
}

class TwoWheeler extends vehicle
{
    TwoWheeler()
    {
        super(2);
    }
}

class roadster extends TwoWheeler
{
    String className = this.getClass().getName();
    roadster()
    {
        System.out.println(className + "'s are " + NoOfWheels + " wheelers.");
    }
}
class bobber extends TwoWheeler
{
    String className = this.getClass().getName();
    bobber()
    {
        System.out.println(className + "'s are " + NoOfWheels + " wheeler.");
    }
}
class FourWheeler extends vehicle
{
    FourWheeler()
    {
        super(4);
    }
}
class sedan extends FourWheeler
{
    String className = this.getClass().getName();
    sedan()
    {
        System.out.println(className + "'s are " + NoOfWheels + " wheeler.");
    }
}
class suv extends FourWheeler
{
    String className = this.getClass().getName();
    suv()
    {
        System.out.println(className + "'s are " + NoOfWheels + " wheeler.");
    }
}
public class _26
{
    public static void main(String[] args)
    {
        TwoWheeler obj1 = new roadster();
        TwoWheeler obj2 = new bobber();
        FourWheeler obj3 = new sedan();
        FourWheeler obj4 = new suv();
    }
}