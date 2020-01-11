package com.learn.java.methodreference;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> consumerLambda = (student -> System.out.println(student));

    static Consumer<Student> consumerMethodReference = System.out::println;

    static Consumer<Student> consumerInstanceMethodReference = Student::printListOfActivities;

    public static void main(String[] args) {
        System.out.println("Using Lambda");
        StudentDataBase.getAllStudents().forEach(consumerLambda);
        System.out.println();
        System.out.println("Using Method Reference");
        StudentDataBase.getAllStudents().forEach(consumerMethodReference);
        System.out.println();
        System.out.println("Using instance method reference");
        StudentDataBase.getAllStudents().forEach(consumerInstanceMethodReference);


    }
}
