package com.learn.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integerList){
        return integerList.stream()
                .reduce(1,(a,b) ->(a*b));
    }

    public static Optional<Integer> performMultiplicationWithougIdentity(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b) ->(a*b));
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4);

        System.out.println(performMultiplication(integerList));

        Optional<Integer> optionalInteger = performMultiplicationWithougIdentity(integerList);
        System.out.println("Without Identity: " + optionalInteger);
        System.out.println(optionalInteger.isPresent());
        optionalInteger.ifPresent(System.out::println);
    }
}
