package streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Aman", 23, 23000, "USA"));
        employeeList.add(new Employee("Dev", 52, 23000, "USA"));
        employeeList.add(new Employee("Ben", 63, 25000, "China"));
        employeeList.add(new Employee("Zade", 34, 56000, "India"));
        employeeList.add(new Employee("Steve", 43, 67000, "India"));
        employeeList.add(new Employee("Sam", 53, 54000, "China"));

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

        {
            System.out.println("FILTERING");

            System.out.println("People older than 30");
            employeeList.stream().filter(employee -> employee.getAge() > 30).forEach(System.out::println);
        }

        {
            System.out.println("\nSLICING");

            System.out.print("Distinct values in integer list:  ");
            integerList.stream().distinct().forEach((x) -> System.out.print(x + " "));
            System.out.println();

            System.out.print("Limiting the returned stream to return only upto n values:  ");
            integerList.stream().distinct().limit(3).forEach(x -> System.out.print(x + " "));
            System.out.println();

            System.out.print("Skipping the first n (here its 2 )values:  ");
            integerList.stream().distinct().skip(2).forEach(x -> System.out.print(x + " "));
        }

        {
            System.out.println("\n\nMAPPING");

            System.out.print("To print names from the list in upperCase: ");
            stringList.stream().map(String::toUpperCase).forEach(x -> System.out.print(x + ", "));

            System.out.print("\nTo get length of words: ");
            stringList.stream().mapToInt(String::length).forEach(x -> System.out.print(x + " "));
        }

        {
            System.out.println("\n\nMATCHING");
            System.out.println("To check if there is any person residing in a particular country:");
            boolean canadian = employeeList.stream().anyMatch(x->x.getCountry().equals("Canada"));
        }

    }
}
