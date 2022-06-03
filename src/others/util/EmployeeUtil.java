package others.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class EmployeeUtil {

    static Employee e1 = new Employee(01, "Sandeep", "Hyderabad", Arrays.asList("Java", "JS"));
    static Employee e2 = new Employee(02, "Madhuri", "Hyderabad", Arrays.asList("JS"));

    static Employee e3 = new Employee(03, "Jhon", "Hyderabad", Arrays.asList("Java", "Python", "C#", "JS"));

    static Employee nullEmp = new Employee("Jhon", "Hyderabad", Arrays.asList("Java", "Python", "C#", "JS"));


    public static List<Employee> getEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);

        return employeeList;
    }
}
