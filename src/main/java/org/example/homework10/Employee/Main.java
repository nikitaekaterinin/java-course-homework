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
        class LocalEmployee {
            private final Employee emp;

            public LocalEmployee(Employee emp) {
                this.emp = emp;
            }

            public int yearsWorked() {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate hireDate = LocalDate.parse(emp.hireDate(), formatter);
                return LocalDate.now().getYear() - hireDate.getYear();
            }

            public String fullName() {
                return emp.firstName() + " " + emp.lastName();
            }
        }

        Comparator<Employee> comparator = new Comparator<>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                LocalEmployee localEmployee1 = new LocalEmployee(emp1);
                LocalEmployee localEmployee2 = new LocalEmployee(emp2);
                if ("name".equals(param)) {
                    return localEmployee1.fullName().compareTo(localEmployee2.fullName());
                } else if ("year".equals(param)) {
                    return Integer.compare(localEmployee1.yearsWorked(), localEmployee2.yearsWorked());
                } else {
                    throw new IllegalArgumentException("Unknown sorting parameter: " + param);
                }
            }
        };

        list.sort(comparator);

        for (Employee emp : list) {
            LocalEmployee localEmployee = new LocalEmployee(emp);
            System.out.println(localEmployee.fullName() + " - Years worked: " + localEmployee.yearsWorked());
        }
    }

    public static record Employee(String firstName, String lastName, String hireDate) {
    }
}