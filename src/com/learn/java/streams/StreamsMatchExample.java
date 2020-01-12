package com.learn.java.streams;

import com.learn.java.data.StudentDataBase;

public class StreamsMatchExample {

    //return true if all students have gpa >= 3.9
    public static boolean allMatch(){
       return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa() >= 3.9);
    }

    //return true if any of the student has gpa = 4.0
    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa() == 4.0);
    }

    //return true if none of the students have gpa = 4.1
    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa() == 4.1);
    }

    public static void main(String[] args) {
        System.out.println("Result of all match where gpa >= 3: " + allMatch());
        System.out.println("Result of any match where gpa = 4: " + anyMatch());
        System.out.println("Result of none match where gpa = 4.1: " + noneMatch());
    }
}
