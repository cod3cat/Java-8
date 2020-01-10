package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    private static Consumer<Student> c2 = System.out::println;
    private static Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
    private static Consumer<Student> c3 = (student) -> System.out.print    (student.getName());
    private static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

    private static void printName(){

        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }

    public static void main(String[] args) {

        c1.accept("nicky");
        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }

    public static void printNameAndActivities(){

        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println("Name and activities");
        studentList.forEach(c3.andThen(c4));
    }

    public static void printNameAndActivitiesUsingCondition(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        System.out.println();
        System.out.println("Name and activities with condition");
        studentList.forEach((student -> {
            if(student.getGradeLevel() >=3){
                c3.andThen(c4).accept(student);
            }
        }));
    }
}
