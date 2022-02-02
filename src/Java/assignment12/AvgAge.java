package Java.assignment12;

import java.util.*;
import java.io.*;
public class AvgAge {
    public static void avgAge(List<Student> students)
    {
        int sumOfAgeOfMale=students.stream().filter(s->s.gender.equals("Male")).mapToInt(i -> i.age).sum();
        int sumOfAgeOfFemale=students.stream().filter(s->s.gender.equals("Female")).mapToInt(i -> i.age).sum();
        CountFemale obj1=new CountFemale();
        long numberofFemales=obj1.countFemale(students);
        System.out.println("Avg Female age"+sumOfAgeOfFemale/numberofFemales);
        CountMale obj2=new CountMale();
        long numberofMales=obj2.countMale(students);
        System.out.println("Avg Male Age"+sumOfAgeOfMale/numberofMales);

    }
}
