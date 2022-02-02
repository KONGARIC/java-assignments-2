package Java.assignment12;

/*Make a Student class having fields id,name,age,gender,engDepartment,year of enrollment ,perTillDate

Add following student in list ;

1.new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8)
2.new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2)
3 new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3)
4.new Student(144, "Murali Gowda", 18, "Male", “Electrical”, 2018, 80)
5.new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70)
6.new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70)
7.new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70)
8.new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80);
9.new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85);
10.new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82);
11.new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83);
12.new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4);
13.new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6);
14.new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8);
15.new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4);
16.new Student(266, "Sanvi Pandey", 17, "Female", “Electric”, 2019, 72.4);
17.new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5);

Use stream api on above list of employees find

1. Print the name of all departments in the college?//Department
2.Get the names of all students who have enrolled after 2018?//StudentNames
3. Get the details of all male student in the computer sci department?//MaleStudents
4. How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)//NumberOfMaleFemaleStudents
5.What is the average age of male and female students?//AvgAge
6.Get the details of student having highest percentage ?//HighestPercentage
7.Count the number of students in each department? (Hint :use Collectors.groupingBy())//NumberOfMaleFemaleStudentsDepartmentWise
8. What is the average percentage achieved in each department?AvgPercentageDepartmentWise
9. Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)//YoungMaleStudentInECE
10.How many male and female students are there in the computer science department?//NumOfMaleFemaleStudentsInCSE

Structure your code so as to comply to clean code(SOLID Principles)
 */


import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] arg)
    {
        Student student1=new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8);
        Student student2=new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2);
        Student student3=new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3);
        Student student4=new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80);
        Student student5=new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70);
        Student student6=new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70);
        Student student7=new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70);
        Student student8=new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80);
        Student student9=new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85);
        Student student10=new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82);
        Student student11=new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83);
        Student student12=new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4);
        Student student13=new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6);
        Student student14=new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8);
        Student student15=new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4);
        Student student16=new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4);
        Student student17=new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5);
        List<Student> students=new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);
        students.add(student11);
        students.add(student12);
        students.add(student13);
        students.add(student14);
        students.add(student15);
        students.add(student16);
        students.add(student17);
        System.out.println();
        System.out.println("Departments :");
        System.out.println();
        Department.allDepartments(students);
        System.out.println();
        System.out.println("Names of students who enrolled to course after 2018 :");
        System.out.println();
        Names.names(students,2018);
        System.out.println();
        System.out.println("Names of Male students who enrolled to Computer Science :");
        System.out.println();
        CSEStudents.names(students,"Computer Science","Male");
        System.out.println();
        System.out.println("Number of male and female students :");
        System.out.println();
        Count obj=new Count();
        obj.count(students);
        System.out.println();
        System.out.println("Avg ages");
        AvgAge.avgAge(students);
        System.out.println();
        HighestPercentage.highestPercentage(students);
        System.out.println();
        NoOfStudentsEachDept.noOfStudentsEachDept(students);
        AvgPercentageInEachDept.avgPercentageInEachDept(students);
        YoungMaleStudentInECE.youngMaleStudentInECE(students);



    }
}

