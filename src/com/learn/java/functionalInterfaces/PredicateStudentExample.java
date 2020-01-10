package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {
    static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;
    private static Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;

    public static void main(String[] args) {

        filterStudentByGradeLevel();
        System.out.println();
        filterStudentByGpa();
        filterMethod();
    }

    private static void filterStudentByGradeLevel(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student) -> {
            if (p1.test(student)){
                System.out.println(student);
            }
        });
    }

    private static void filterStudentByGpa(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student) -> {
            if (p2.test(student)){
                System.out.println(student);
            }
        });
    }

    public static void filterMethod(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach((student -> {
            if(p1.and(p2).test(student)){
                System.out.println(student);
            }
        }));

    }
}
