class Student
{
    int name;
    int id;
    int marks;
    String course="CSE";
    public Student(int name,int id)
    {
        this.name=name;
        this.id=id;
    }
    void printDetails()
    {
        System.out.println("name"+name);
        System.out.println("id"+id);}
    void setMarks(int marks)
    {
        this.marks=marks;
    }
    void getMarks(int marks)
    {
        System.out.println(marks);
    }
    void course()
    {
         System.out.println(course);
    }
}
public class VoilateSolid {
    public void main(String[] arg)
    {

    }
}
