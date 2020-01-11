package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExamplle {

    public static void main(String[] args) {
        //student name and their activities in a map
        Predicate<Student> gpaPredicate = (student -> student.getGpa() >= 3.9);
        Predicate<Student> gradePredicate = (student -> student.getGradeLevel() >= 3);
        Map<String, List<String>> studentMap =
                StudentDataBase.getAllStudents().stream()
                        .filter(gradePredicate)
                        .filter(gpaPredicate)
                        .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentMap);
    }
}
