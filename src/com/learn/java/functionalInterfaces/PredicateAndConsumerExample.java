package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    Predicate<Student> p1 = (student -> student.getGradeLevel() >= 3);
    Predicate<Student> p2 = (student -> student.getGpa() >= 3.9);

    BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;
    BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + ": " + activities);

    Consumer<Student> consumer = (student -> {
        if(p1.and(p2).test(student)){
            biConsumer.accept(student.getName(), student.getActivities());
        }
    });

    Consumer<Student> consumer2 = (student -> {
       if(biPredicate.test(student.getGradeLevel(), student.getGpa())){
           biConsumer.accept(student.getName(), student.getActivities());
       }
    });

    public void printNameAndActivities(List<Student> students){
        System.out.println("Using predicate");
        students.forEach(consumer);
        System.out.println();
        System.out.println("Using biPredicate");
        students.forEach(consumer2);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);
    }
}
