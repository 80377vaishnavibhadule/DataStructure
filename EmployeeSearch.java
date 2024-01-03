package assignment;

public class EmployeeSearch {

    public static class Employee {
        int empId;
        String name;
        double salary;

        public Employee(int empId, String name, double salary) {
            this.empId = empId;
            this.name = name;
            this.salary = salary;
        }
    }

    public static Employee searchEmployeeById(Employee[] employees, int empId) {
        for (Employee employee : employees) {
            if (employee.empId == empId) {
                return employee;
            }
        }
        return null;
    }

    public static Employee searchEmployeeByName(Employee[] employees, String name) {
        for (Employee employee : employees) {
            if (employee.name.equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public static Employee searchEmployeeBySalary(Employee[] employees, double salary) {
        for (Employee employee : employees) {
            if (employee.salary == salary) {
                return employee;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(101, "vaishnavi", 50000.0),
                new Employee(102, "Tejaswini", 60000.0),
                new Employee(103, "Ritesh", 55000.0)
                // Add more employees as needed
        };

        int searchEmpId = 101;
        String searchName = "Tejaswini";
        double searchSalary = 55000.0;

        Employee foundById = searchEmployeeById(employees, searchEmpId);
        Employee foundByName = searchEmployeeByName(employees, searchName);
        Employee foundBySalary = searchEmployeeBySalary(employees, searchSalary);

        if (foundById != null) {
            System.out.println("Employee found by ID: " + foundById.name);
        } else {
            System.out.println("Employee not found by ID: " + searchEmpId);
        }

        if (foundByName != null) {
            System.out.println("Employee found by Name: " + foundByName.name);
        } else {
            System.out.println("Employee not found by Name: " + searchName);
        }

        if (foundBySalary != null) {
            System.out.println("Employee found by Salary: " + foundBySalary.name);
        } else {
            System.out.println("Employee not found by Salary: " + searchSalary);
        }
    }
}

