package com.learn.java.methodreference;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> p2 = RefactorMethodReferenceExample::greaterThanGradeLevel;

    static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3;

    public static boolean greaterThanGradeLevel(Student student){
       return student.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {
        System.out.print(p2.test(StudentDataBase.studentSupplier.get()));
    }
}
