package com.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Prasenjit Kumar Das
 */
public class StreamMain {
    static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(
                new Employee("prasen", "bangalore", 12000.0, Arrays.asList("Prj 1", "Prj 2"))
        );

        employees.add(
                new Employee("rohan", "hyderabad", 10000.0, Arrays.asList("Prj 3", "Prj 4"))
        );

        employees.add(
                new Employee("rajat", "noida", 2000.0, Arrays.asList("Prj 1", "Prj 3"))
        );

        employees.add(
                new Employee("mayank", "gurgaon", 22000.0, Arrays.asList("Prj 3", "Prj 2"))
        );
    }
    public static void main(String[] args) {

        //forEach
        employees.stream()
                .forEach(employee -> System.out.println(employee));

        //map
        List<Employee> emp1 = employees.stream()
                .map(employee -> new Employee(
                        employee.getName(),
                        employee.getAddress(),
                        employee.getSalary() * 1.10,
                        employee.getProjects()
                )).collect(Collectors.toList());

        System.out.println(emp1);

        //filter
        List<Employee> filteredList = employees.stream()
                .filter(employee -> employee.getSalary() > 10000)
                .map(employee -> new Employee(
                        employee.getName(),
                        employee.getAddress(),
                        employee.getSalary() * 1.10,
                        employee.getProjects()
                )).collect(Collectors.toList());

        System.out.println(filteredList);


        //first employee having more than 10000 salary
        Employee firstEmployee = employees.stream()
                .filter(employee -> employee.getSalary() > 10000)
                .findFirst().orElse(null);

        System.out.println(firstEmployee);

        //flatMap
        String projects = employees.stream()
                .map(employee -> employee.getProjects())
                .flatMap(strings -> strings.stream())
                .collect(Collectors.joining(","));

        System.out.println(projects);

        //sorting
        List<Employee> sortedEmp = employees.stream()
                .sorted((o1, o2) -> o1.getName()
                .compareToIgnoreCase(o2.getName()))
                .collect(Collectors.toList());

        System.out.println(sortedEmp);

        // min or max value
        Employee maxSalary = employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoSuchElementException::new);

        System.out.println(maxSalary);

        //reduce
        Double totSal = employees.stream()
                .map(employee -> employee.getSalary())
                .reduce(0.0, Double::sum);

        System.out.println(totSal);


        String str = "Prasenjit1p Das";
        Map<Character, Long> result = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
        System.out.println(result);

        Map<String, Long> result1 = Stream.of(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));
        System.out.println(result1);
    }
}
