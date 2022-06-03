package others;

import others.util.Employee;
import others.util.EmployeeUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckAnagrams {

public static void  main(String[] args){
    checkCF();
}

private static void checkCF() {
    List<Employee>  listA = new ArrayList<>();
    List<Employee> listB = new ArrayList<>();
    //listB.add(999,);

    listA.addAll(EmployeeUtil.getEmployeeList());
    listB.addAll(EmployeeUtil.getEmployeeList());

    Map<Integer, Employee> employeeMap = listA.stream()
            .collect(Collectors.toMap(employee -> employee.getId(), Function.identity()));
   // Set<Employee> uniqueEmployees = listB.stream().filter(x -> employeeMap.put(x.getId(),x)).collect(Collectors.toSet());

    //uniqueEmployees.stream().forEach(System.out::print);

}}
