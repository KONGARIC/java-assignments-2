package Java.assignment12;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFemale extends Count {
    public long countFemale(List<Student> students)
    {
        Map<String,Long> result = students.stream().map(s->s.gender).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        return result.get("Female");

    }
}
