package Java.assignment12;
import java.io.*;
import java.util.*;
public class YoungMaleStudentInECE {
    public static void youngMaleStudentInECE(List<Student> students)
    {
        int age=students.stream().filter(v->v.branch.equals("Electronic") && v.gender.equals("Male")).mapToInt(v -> v.age).sum();
        System.out.println("youngest male student in the Electronic department");
        int id=students.stream().filter(v->v.branch.equals("Electronic") && v.gender.equals("Male") && v.age==age).mapToInt(v -> v.age).min().orElseThrow(NoSuchElementException::new);//mapToInt(v -> v.age).min().orElseThrow(NoSuchElementException::new);
        students.stream().filter(s->s.rollno==id).map(s->s.rollno).forEach(System.out::println);
        students.stream().filter(s->s.rollno==id).map(s->s.name).forEach(System.out::println);
        students.stream().filter(s->s.rollno==id).map(s->s.gender).forEach(System.out::println);
        students.stream().filter(s->s.rollno==id).map(s->s.age).forEach(System.out::println);
        students.stream().filter(s->s.rollno==id).map(s->s.branch).forEach(System.out::println);
        students.stream().filter(s->s.rollno==id).map(s->s.year).forEach(System.out::println);
        students.stream().filter(s->s.rollno==id).map(s->s.percentage).forEach(System.out::println);

    }
}
