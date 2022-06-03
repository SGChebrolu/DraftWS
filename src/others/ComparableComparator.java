package others;

import others.util.Employee;
import others.util.EmployeeUtil;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableComparator {
    public static void main(String[] args) {

        List<Employee> employeeList = EmployeeUtil.getEmployeeList();

        List<Employee> sortedEmployees = employeeList
                                        .stream()
                                        .sorted(Comparator.comparing(Employee::getName))
                                        .collect(Collectors.toList());

        sortedEmployees.forEach(System.out::print);

        Collections.sort(employeeList);
        Collections.sort(employeeList,Employee.NameComparator.thenComparing(Employee.LocationComparator));

        //Comparable , Compartor both are functional interfaces
        //Comparable is implemented at base class only and is used for comparing based on natual ordering only
        //Comparator can be created seperatley and used
        //Comparator is used if we have to


    }
}