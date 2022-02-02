package Java.assignment12;

public class Student {
    //new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8)
    int rollno;
    String name;
    int age;
    String gender;
    String branch;
    int year;
    double percentage;
    public Student(int rollno,String name,int age,String gender,String branch,int year,double percentage)
    {
        this.rollno=rollno;
        this.age=age;
        this.name=name;
        this.gender=gender;
        this.branch=branch;
        this.year=year;
        this.percentage=percentage;
    }

}
