package Java.assignment12;
import java.util.*;
import java.io.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AvgPercentageInEachDept {
    public static void avgPercentageInEachDept(List<Student> students)
    {
        Map<String,Long> result = students.stream().map(s->s.branch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        double chem=students.stream().filter(s->s.branch.equals("Chemical")).mapToDouble(i -> i.percentage).sum();
        System.out.println("Avg Percentage in Chemical Depatment "+chem/result.get("Chemical"));
        double text=students.stream().filter(s->s.branch.equals("Textile")).mapToDouble(i -> i.percentage).sum();
        System.out.println("Avg Percentage in Textile Depatment "+text/result.get("Textile"));
        double mech=students.stream().filter(s->s.branch.equals("Mechanical")).mapToDouble(i -> i.percentage).sum();
        System.out.println("Avg Percentage in Mechanical Depatment "+mech/result.get("Mechanical"));
        double cs=students.stream().filter(s->s.branch.equals("Computer Science")).mapToDouble(i -> i.percentage).sum();
        System.out.println("Avg Percentage in Computer science Depatment "+cs/result.get("Computer Science"));
        double eee=students.stream().filter(s->s.branch.equals("Electric")).mapToDouble(i -> i.percentage).sum();
        System.out.println("Avg Percentage in Electric Depatment "+eee/result.get("Electric"));
        double ece=students.stream().filter(s->s.branch.equals("Electronic")).mapToDouble(i -> i.percentage).sum();
        System.out.println("Avg Percentage in Electronic Depatment "+ece/result.get("Electronic"));
        double sec=students.stream().filter(s->s.branch.equals("Security")).mapToDouble(i -> i.percentage).sum();
        System.out.println("Avg Percentage in SEcurity Depatment "+sec/result.get("Security"));


    }
}
