import java.util.*;
class Person
{
    String name;
    int age;
    int salary;
    void set()
    {
        Scanner scan1 = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String inp = scan1.nextLine();
        name=inp;
        System.out.print("Enter Age: ");
        int inp2 = scan1.nextInt();
        age=inp2;
        System.out.print("Enter Salary: ₹");
        inp2= scan1.nextInt();
        salary=inp2;
        scan1.close();
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: ₹"+salary);
    }
}
public class _21
{
    public static void main(String[] args)
    {
        Person p = new Person();
        p.set();
        p.display();
    }
}