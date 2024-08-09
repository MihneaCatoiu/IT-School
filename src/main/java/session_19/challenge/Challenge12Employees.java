package session_19.challenge;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;
    double salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

    public class Challenge12Employees {

            public static void main(String[] args) {
                List<Employee> employees = Arrays.asList(
                        new Employee("Alice", "IT", 8000),
                        new Employee("Anthony", "CEO", 9000),
                        new Employee("Bruce", "IT", 7000),
                        new Employee("Dan", "Security", 8000),
                        new Employee("Mike", "Gatekeeper", 6000)
                );

                Optional<Map.Entry<String, Double>> highestSalaryDepartment = employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.summingDouble(Employee::getSalary)
                        ))
                        .entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue());

                if (highestSalaryDepartment.isPresent()) {
                    Map.Entry<String, Double> entry = highestSalaryDepartment.get();
                    System.out.println("Department with highest total salary: " + entry.getKey());
                    System.out.println("Total salary: " + entry.getValue());
                } else {
                    System.out.println("No departments found.");
                }
            }
        }
