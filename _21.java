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
        name = scan1.nextLine();
        System.out.print("Enter Age: ");
        age = scan1.nextInt();
        System.out.print("Enter Salary: $");
        salary = scan1.nextInt();
        scan1.close();
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: $"+salary);
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