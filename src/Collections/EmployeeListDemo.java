package Collections;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeListDemo {

    // Inner Employee class
    static class Employee {
        int id;
        String name;
        String department;
        double salary;

        Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return id + " | " + name + " | " + department + " | ₹" + salary;
        }
    }

    public static void main(String[] args) {

        // List to store employees (real-time usage)
        List<Employee> employeeList = new ArrayList<>();

        // 1️⃣ Add employees
        employeeList.add(new Employee(101, "Aashish", "IT", 55000));
        employeeList.add(new Employee(102, "Rahul", "HR", 40000));
        employeeList.add(new Employee(103, "Sneha", "IT", 65000));
        employeeList.add(new Employee(104, "Neha", "Finance", 60000));

        System.out.println("---- All Employees ----");
        employeeList.forEach(System.out::println);

        // 2️⃣ Search employee by name
        System.out.println("\n---- Search: Aashish ----");
        employeeList.stream()
                .filter(e -> e.name.equalsIgnoreCase("Aashish"))
                .forEach(System.out::println);

        // 3️⃣ Filter by department
        System.out.println("\n---- IT Department Employees ----");
        employeeList.stream()
                .filter(e -> e.department.equalsIgnoreCase("IT"))
                .forEach(System.out::println);

        // 4️⃣ Sort employees by salary
        System.out.println("\n---- Sorted by Salary (Ascending) ----");
        employeeList.sort(Comparator.comparingDouble(e -> e.salary));
        employeeList.forEach(System.out::println);

        // 5️⃣ Remove employee by ID
        System.out.println("\n---- Remove Employee with ID 102 ----");
        employeeList.removeIf(e -> e.id == 102);
        employeeList.forEach(System.out::println);

        // 6️⃣ Convert List to Map (ID → Name)
        System.out.println("\n---- Convert List to Map ----");
        Map<Integer, String> empMap = employeeList.stream()
                .collect(Collectors.toMap(e -> e.id, e -> e.name));
        empMap.forEach((k, v) -> System.out.println(k + " = " + v));

        // 7️⃣ Count employees
        System.out.println("\nTotal Employees: " + employeeList.size());
    }
}
