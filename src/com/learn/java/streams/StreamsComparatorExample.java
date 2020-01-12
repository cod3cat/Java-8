package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortedStudentsByName(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortedStudentsByGpa(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa)   )
                .collect(Collectors.toList());
    }

    public static List<Student> sortedStudentsByGpaReversed(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Sort using Name");
        sortedStudentsByName().forEach(System.out::println);

        System.out.println();

        System.out.println("Sort using gpa");
        sortedStudentsByGpa().forEach(System.out::println);

        System.out.println();
        System.out.println("Sort using gpa reversed");
        sortedStudentsByGpaReversed().forEach(System.out::println);
    }
}
