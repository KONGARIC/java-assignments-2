package Java.assignment12;
import java.util.*;
import java.io.*;
public class HighestPercentage {
    public static void highestPercentage(List<Student> students)
    {
        double max=students.stream().map(s->s.percentage).mapToDouble(Double::doubleValue).max().getAsDouble();
        System.out.println("Student Details Highest Percentage ");
        students.stream().filter(s->s.percentage==max).map(s->s.rollno).forEach(System.out::println);
        students.stream().filter(s->s.percentage==max).map(s->s.name).forEach(System.out::println);
        students.stream().filter(s->s.percentage==max).map(s->s.gender).forEach(System.out::println);
        students.stream().filter(s->s.percentage==max).map(s->s.age).forEach(System.out::println);
        students.stream().filter(s->s.percentage==max).map(s->s.branch).forEach(System.out::println);
        students.stream().filter(s->s.percentage==max).map(s->s.year).forEach(System.out::println);
        students.stream().filter(s->s.percentage==max).map(s->s.percentage).forEach(System.out::println);



    }
}
