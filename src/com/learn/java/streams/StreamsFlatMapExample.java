package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {


    public static List<String> printStudentActivities(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
    }
}
