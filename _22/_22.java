class Student
{
    String name;
    int rn;
    int marks;
    Student()
    {
        name="";
        rn=0;
        marks=0;
    }
    Student(String name, int rn, int marks)
    {
        this.name=name;
        this.rn=rn;
        this.marks=marks;
    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll No.: "+rn);
        System.out.println("Total Marks: "+marks);
    }
}
public class _22
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student("ABC", 1, 99);
        s2.display();
    }
}