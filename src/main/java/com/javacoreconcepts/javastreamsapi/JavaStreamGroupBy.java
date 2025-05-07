package com.javacoreconcepts.javastreamsapi;

import com.javacoreconcepts.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaStreamGroupBy {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Alice", "HR", 50000),
                new Employee("Bob", "IT", 70000),
                new Employee("Charlie", "HR", 52000),
                new Employee("David", "IT", 72000),
                new Employee("Eve", "Finance", 60000)
        );

        Map<String, List<Employee>> groupedByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        groupedByDept.forEach((dept, emps) -> {
            System.out.println(dept + ": " + emps);
        });
    }
}
