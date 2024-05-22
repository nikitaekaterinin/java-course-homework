package org.example.homework10.Employee;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("Minnie", "Mouse", "01/02/2015");
        Employee e2 = new Employee("Mickie", "Mouse", "05/08/2000");
        Employee e3 = new Employee("Daffy", "Duck", "11/02/2011");
        Employee e4 = new Employee("Daisy", "Duck", "05/03/2013");
        Employee e5 = new Employee("Goofy", "Dog", "23/07/2020");

        List<Employee> list = new ArrayList<>(Arrays.asList(e1, e2, e3, e4, e5));

        printOrderedList(list, "name");
        System.out.println();
        printOrderedList(list, "year");
    }

    public static void printOrderedList(List<Employee> list, String param) {
        LocalEmployee localEmployee = new LocalEmployee();

        Comparator<Employee> comparator = null;
        switch (param) {
            case "name":
                comparator = Comparator.comparing(emp -> localEmployee.fullName(emp));
                break;
            case "year":
                comparator = Comparator.comparingInt(emp -> localEmployee.yearsWorked(emp));
                break;
            default:
                throw new IllegalArgumentException("Unknown sorting parameter: " + param);
        }

        list.sort(comparator);

        for (Employee emp : list) {
            System.out.println(localEmployee.fullName(emp) + " - Years worked: " + localEmployee.yearsWorked(emp));
        }
    }

    static class LocalEmployee {
        public int yearsWorked(Employee emp) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate hireDate = LocalDate.parse(emp.hireDate, formatter);
            return LocalDate.now().getYear() - hireDate.getYear();
        }

        public String fullName(Employee emp) {
            return emp.firstName + " " + emp.lastName;
        }
    }

    public static record Employee(String firstName, String lastName, String hireDate) {
    }
}