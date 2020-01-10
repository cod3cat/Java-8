package com.learn.java.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    private static Function<String, String> function = (name) -> name.toUpperCase();
    private static Function<String, String> addSomeString = (input) -> input.concat(" default");

    public static void main(String[] args) {
        //Using Function interface
        System.out.println("Result is: " + function.apply("java8"));
        System.out.println();

        //Using adnThen default method
        System.out.println("Result is: " + function.andThen(addSomeString).apply("java8"));
        System.out.println();

        //Using compose default method
        System.out.println("Result is: " + function.compose(addSomeString).apply("java8"));
    }
}
