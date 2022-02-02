package Java.assignment12;

import java.util.List;

public class CSEStudents extends Names{
    public static void names(List<Student> students, String branch,String gender)
    {
        students.stream().filter(s->s.branch.equals(branch)).filter(s->s.gender.equals(gender)).map(s->s.name).distinct().forEach(System.out::println);
    }
}
