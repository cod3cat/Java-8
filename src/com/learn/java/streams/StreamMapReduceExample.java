package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.Optional;


public class StreamMapReduceExample {

    //return the max number of notebooks a student in class < 2 has
    private static Optional<Integer> noOfNotebooks(){
       return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel() <= 2)
                .map(Student::getNotebooks)
                .reduce(Integer::max);
    }

    public static void main(String[] args) {
        System.out.println(noOfNotebooks());
    }
}
