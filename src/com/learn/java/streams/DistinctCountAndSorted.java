package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctCountAndSorted {

    public static List<String> printStudentUniqueActivities(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    private static List<String> printStudentSortedUniqueActivities() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    private static long getStudentUniqueActivitiesCount() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }

    public static void main(String[] args) {
        System.out.println("Unique activities using distinct");
        System.out.println(printStudentUniqueActivities());
        System.out.println();
        System.out.println("Sorted unique activities using sort");
        System.out.println(printStudentSortedUniqueActivities());
        System.out.println();
        System.out.println("Count of unique activities using count");
        System.out.println(getStudentUniqueActivitiesCount());
    }
}
