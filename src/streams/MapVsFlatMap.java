package streams;

import others.util.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args){
        Employee e1 = new Employee(01,"Sandeep","Hyderabad", Arrays.asList("Java","JS"));
        Employee e2 = new Employee(02,"Madhuri","Hyderabad", Arrays.asList("JS"));
        Employee e3 = new Employee(03,"Jhon","Hyderabad",Arrays.asList("Java","Python","C#","JS"));

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        List<Integer> empIds = employeeList.stream().map(x -> x.getId()).collect(Collectors.toList());
        System.out.println(empIds);

        List<List<String>> empPreferredLanguages = employeeList.stream().map(x -> x.getLanguageInterests()).collect(Collectors.toList());
        System.out.println(empPreferredLanguages);

        Set<String> empPreferredLanguagesUnique = employeeList.stream().flatMap(x -> x.getLanguageInterests().stream()).map(x->x.toUpperCase()).collect(Collectors.toSet());
        System.out.println(empPreferredLanguagesUnique);


    }
}
