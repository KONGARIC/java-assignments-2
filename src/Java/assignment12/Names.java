package Java.assignment12;

import java.util.List;

public class Names {
    public static void names(List<Student> students,int year)
    {
        students.stream().filter(s->s.year>year).map(s->s.name).distinct().forEach(System.out::println);
    }
}
