package Java.assignment12;
import java.util.*;
import java.io.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NoOfStudentsEachDept {
    public static void noOfStudentsEachDept(List<Student> students)
    {
        Map<String,Long> result = students.stream().map(s->s.branch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);
    }
}
