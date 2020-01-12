package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    //Using Reduce with identity
    public static int performMultiplication(List<Integer> integerList){
        return integerList.stream()
                .reduce(1,(a,b) ->(a*b));
    }

    //Using reduce without identity
    public static Optional<Integer> performMultiplicationWithougIdentity(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b) ->(a*b));
    }

    //Using reduce to get the name of the student with highest gpa
    public static Optional<String> getStudentNameWithHighestGpa(){
        return StudentDataBase.getAllStudents().stream() // returns stream of students
                .reduce((s1, s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2) //returns student with highest gpa
                .map(Student::getName); //returns name of the student that has highest gpa
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4);

        System.out.println(performMultiplication(integerList));

        Optional<Integer> optionalInteger = performMultiplicationWithougIdentity(integerList);
        System.out.println("Without Identity: " + optionalInteger);
        System.out.println(optionalInteger.isPresent());
        optionalInteger.ifPresent(System.out::println);

        //get optional string with student name
        Optional<String> stringOptional = getStudentNameWithHighestGpa();
        //print the name using method reference
        stringOptional.ifPresent(System.out::print);
    }
}
