import java.util.*;
class Employee
{
    String name;
    int age;
    int salary;
    static int empno;
    Employee()
    {
        name="";
        age=0;
        salary=0;
        empno=1;
    }
    void set()
    {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = scan1.nextLine();
        System.out.print("Enter Age: ");
        age = scan1.nextInt();
        System.out.print("Enter Salary: $");
        salary = scan1.nextInt();
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: $"+salary);
        System.out.println("Emp No.: "+empno++);
    }
}
public class _24
{
    public static void main(String[] args)
    {
        Employee[] e;
        e = new Employee[10];
        for (int i = 0; i < 10; i++) 
        {
            e[i] = new Employee();
        }
        for (int i = 0; i < 10; i++) 
        {
            e[i].set();
        }
        for (int i = 0; i < 10; i++) 
        {
            e[i].display();
        }
    }
}
