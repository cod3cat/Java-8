package com.learn.java.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {
        Map<String, Double> gradeMap = new HashMap<>();
        students.forEach((student ->{
            if(PredicateAndConsumerExample.p1.test(student)){
            gradeMap.put(student.getName(), student.getGpa());}
        }));
        return gradeMap;
    });

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
