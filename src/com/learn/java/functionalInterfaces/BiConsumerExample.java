package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : "  + activities  );
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach((student -> biConsumer.accept(student.getName(),student.getActivities())));
    }

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a,b) -> System.out.println("a : " +a+ " ,b: " +b);

        biConsumer.accept("java7", "java8");

        BiConsumer<Integer, Integer> biConsumer1 = (a,b) -> System.out.println("Product is: " + (a*b));
        BiConsumer<Integer, Integer> biConsumer2 = (a,b) -> System.out.println("Division is: " + (a/b));

        biConsumer1.andThen(biConsumer2).accept(10, 5);

        nameAndActivities();
    }
}
