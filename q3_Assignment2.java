package assignment;

import java.util.Arrays;

public class EmployeeSortBySalary {

    public static class Employee implements Comparable<Employee> {
        private String name;
        private double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public int compareTo(Employee otherEmployee) {
          
            return Double.compare(this.salary, otherEmployee.salary);
        }

        @Override
        public String toString() {
            return "Employee{name='" + name + "', salary=" + salary + '}';
        }
    }

    public static void sortEmployeesBySalary(Employee[] employees) {
        Arrays.sort(employees);
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Vaishnavi", 50000.0),
                new Employee("Tejaswini", 60000.0),
                new Employee("Ritesh", 55000.0)
             
        };

        System.out.println("Employees (Unsorted):");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        sortEmployeesBySalary(employees);

        System.out.println("\nEmployees (Sorted by Salary):");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

