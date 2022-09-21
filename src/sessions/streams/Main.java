package sessions.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Aman", 23, 23000, "Tajikistan"));
        employeeList.add(new Employee("Dev", 52, 23000, "India"));
        employeeList.add(new Employee("Ben", 63, 25000, "India"));
        employeeList.add(new Employee("Zade", 34, 56000, "India"));
        employeeList.add(new Employee("Steve", 43, 67000, "India"));
        employeeList.add(new Employee("Sam", 53, 54000, "India"));

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(12);
        integerList.add(12);
        integerList.add(32);
        integerList.add(56);
        integerList.add(6);

        List<String> stringList = new ArrayList<>();
        stringList.add("Aman");
        stringList.add("Dev");
        stringList.add("Joy");
        stringList.add("Iyan");
        stringList.add("Peter");



        employeeList.stream().filter(x-> x.getAge() > 30).forEach(System.out::println);
        integerList.stream().distinct().forEach(System.out::println);
        integerList.stream().distinct().limit(3).forEach(System.out::println);
        integerList.stream().skip(3).forEach(System.out::println);

        stringList.stream().map(String::toUpperCase).forEach(System.out::println);
        stringList.stream().map(String::length).forEach(System.out::println);

        // Number of canadian people
        long canadian1 = employeeList.stream().filter(x->x.getCountry().equals("Canada")).count() ;
        System.out.println(canadian1);

        // Is there any canadian person?
        boolean canadian2 = employeeList.stream().anyMatch(x->x.getCountry().equals("Canada"));
        System.out.println(canadian2);

        // Find first Indian if exists
        Optional<Employee> optionalEmployee =
                employeeList.stream().filter(x->x.getCountry().equals("India")).findFirst();

        //Optional methods
        System.out.println(optionalEmployee.isEmpty());
        System.out.println(optionalEmployee.isPresent());


        // Get total salary of Employees
        Optional<Integer> totalSalary = employeeList.stream().map(Employee::getSalary).reduce((a, b)->a+b);
        Double totalSalary2 = employeeList.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(totalSalary2);


        // Get Employee with the highest salary
        Optional<Employee> optionalEmployee2 = employeeList.stream().max((o1, o2) -> o1.getSalary()-o2.getSalary());
        optionalEmployee.ifPresent(System.out::println);

        // Create a List<Integer> from List<Employee>
        List<Integer> integersOfEmployee = employeeList.stream().map(Employee::getSalary).toList();
        System.out.println(integersOfEmployee);

        // Create a map from List<Employee>
        Map<String, Integer> employeesInfo = employeeList.stream().collect(Collectors.toMap(Employee::getName, Employee::getAge));
        System.out.println(employeesInfo);


        //Get number of employees older than 30
        long count = employeeList.stream().filter(emp -> emp.getAge() > 30).count();
        System.out.println(count);
    }


}
