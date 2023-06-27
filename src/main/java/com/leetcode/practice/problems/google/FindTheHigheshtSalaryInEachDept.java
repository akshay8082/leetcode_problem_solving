package com.leetcode.practice.problems.google;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class FindTheHigheshtSalaryInEachDept {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(Employee.builder().name("John").salary(1000).department("DEV").build());
        employees.add(Employee.builder().name("Cena").salary(2000).department("DEV").build());
        employees.add(Employee.builder().name("Stone").salary(4000).department("QA").build());
        employees.add(Employee.builder().name("Cold").salary(8000).department("QA").build());
        employees.add(Employee.builder().name("Goldberg").salary(9000).department("DEVOPS").build());

        // Solution 1
        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary))))));

        // Solution 2

        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)), Optional::get))));


    }
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    static class Employee{

        private String name;
        private int salary;
        private String department;
    }
}
