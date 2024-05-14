package org.example.homework12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Kate", 20, 100));
        students.add(new Student("Tim", 21, 90));
        students.add(new Student("Artie", 22, 56));
        students.add(new Student("Tamara", 23, 100));
        students.add(new Student("Izabella", 19, 98));
        students.add(new Student("Sam", 25, 50));

        System.out.println("List of student's names:");
        printAllStudentsNames(students);

        System.out.println("List of student's names who is elder than 20 years:");
        printNamesElderThan20(students);

        System.out.println("List of student's names who has \"A\" score:");
        printNamesWhoHasScoreA(students);

        System.out.println("Average student's grade is: " + calculateAvgGrade(students) + "\n");

        System.out.println("The name of students with highest score is: " + studentsWithHighestGrade(students) + "\n");

        System.out.println("Count of students who has grade lower than 60: " + countLowGradeStudents(students));

    }

    public static void printAllStudentsNames(List<Student> students) {
        students.stream()
                .map(Student::getName)
                .forEach(System.out::println);
        System.out.println();
    }

    public static void printNamesElderThan20(List<Student> students) {
        students.stream()
                .filter(student -> student.getAge() > 20)
                .map(Student::getName)
                .forEach(System.out::println);
        System.out.println();
    }

    public static void printNamesWhoHasScoreA(List<Student> students) {
        students.stream()
                .filter(student -> student.getGrade() >= 90)
                .map(Student::getName)
                .forEach(System.out::println);
        System.out.println();
    }

    public static double calculateAvgGrade(List<Student> students) {
        return students.stream()
                .mapToInt(Student::getGrade)
                .average()
                .orElse(0.0);
    }

    public static String studentsWithHighestGrade(List<Student> students) {
        int maxGrade = students.stream()
                .mapToInt(Student::getGrade)
                .max()
                .orElseThrow();

        return students.stream()
                .filter(student -> student.getGrade() == maxGrade)
                .map(Student::getName)
                .collect(Collectors.joining(", "));
    }

    public static int countLowGradeStudents(List<Student> students) {
        return Math.toIntExact(students.stream()
                .filter(student -> student.getGrade() < 60)
                .count());
    }
}