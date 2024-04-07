import java.util.*;

public class _25 
{
    static class Employee 
    {
        String name;
        int empno, salary, age;

        Employee(String n, int en, int sal, int ag) 
        {
            name = n;
            empno = en;
            salary = sal;
            age = ag;
        }
    }

    static class NonTeaching extends Employee 
    {
        String typeOfWork;

        NonTeaching(String name, int empno, int sal, int age, String work) 
        {
            super(name, empno, sal, age);
            typeOfWork = work;
        }
    }

    static class Teaching extends Employee 
    {
        String nameOfSubject;

        Teaching(String name, int empno, int sal, int age, String subject) 
        {
            super(name, empno, sal, age);
            nameOfSubject = subject;
        }
    }

    public static void main(String[] args) 
    {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Teaching("Shyam", 1, 4000, 30, "Math"));
        employees.add(new Teaching("Raju", 2, 3000, 25, "Science"));
        employees.add(new NonTeaching("Babu Rao", 3, 2000, 26, "Clerk"));
        employees.add(new NonTeaching("Devi Prasad", 4, 1000, 55, "Librarian"));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee number to find: ");
        int empNoToFind = scanner.nextInt();
        scanner.close();

        for (Employee e : employees) 
        {
            if (e.empno == empNoToFind) 
            {
                System.out.println("Name: " + e.name);
                System.out.println("EmpNo: " + e.empno);
                System.out.println("Salary: " + e.salary);
                System.out.println("Age: " + e.age);
                if (e instanceof Teaching) 
                {
                    System.out.println("Subject: " + ((Teaching)e).nameOfSubject);
                } else if (e instanceof NonTeaching) 
                {
                    System.out.println("Type of Work: " + ((NonTeaching)e).typeOfWork);
                }
            }
        }
    }
}
