package Java.assignment12;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Department {
    public static void allDepartments(List<Student> allBranchs)
    {
        allBranchs.stream().map(s->s.branch).distinct().forEach(System.out::println);
    }
}
