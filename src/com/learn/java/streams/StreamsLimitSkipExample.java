package com.learn.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    public static Optional<Integer> sumOfFirst3IntegersUsingLimit(List<Integer> integerList){
        return integerList.stream()
                .limit(3)
                .reduce(Integer::sum);
    }

    public static Optional<Integer> sumOfLast3IntegersUsingLimit(List<Integer> integerList){
        return integerList.stream()
                .skip(5)
                .reduce(Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8);

        Optional<Integer> sumUsingLimit = sumOfFirst3IntegersUsingLimit(integerList);
        System.out.print("Sum of first 3 elements using limit: ");
        sumUsingLimit.ifPresent(System.out::println);

        Optional<Integer> sumUsingSkip = sumOfLast3IntegersUsingLimit(integerList);
        System.out.print("Sum of last 3 elements using skip: ");
        sumUsingSkip.ifPresent(System.out::println);
    }
}
