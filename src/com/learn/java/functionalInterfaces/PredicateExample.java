package com.learn.java.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    private static Predicate<Integer> predicate = (i) -> i % 2 == 0;
    private static Predicate<Integer> predicate2 = (i) -> i%5 == 0;

    public static void main(String[] args) {
        System.out.println(predicate.test(2));

        System.out.println(predicate.and(predicate2).test(10));
    }
}
