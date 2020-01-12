package com.learn.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {
    //return maximum number in the list using reduce
    public static Optional<Integer> findMaxNumber(List<Integer> integerList){
        return integerList.stream()
                .reduce(Integer::max);
    }

    //return minimum number in the list using reduce
    public static Optional<Integer> findMinNumber(List<Integer> integerList){
        return integerList.stream()
                .reduce(Integer::min);
    }

    //return sum of all the elements of the list using reduce
    public static Optional<Integer> findSum(List<Integer> integerList){
        return integerList.stream()
                .reduce(Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9);
        System.out.print("Maximum integer in the list is: " );
        Optional<Integer> optionalIntegerMax = findMaxNumber(integerList);
        optionalIntegerMax.ifPresent(System.out::print);

        System.out.println("");
        System.out.print("Minimum integer in the list is: " );
        Optional<Integer> optionalIntegerMin = findMinNumber(integerList);
        optionalIntegerMin.ifPresent(System.out::print);

        System.out.println();
        System.out.print("Sum of integers in the list is: " );
        Optional<Integer> optionalIntegerSum = findSum(integerList);
        optionalIntegerSum.ifPresent(System.out::print);
    }
}
