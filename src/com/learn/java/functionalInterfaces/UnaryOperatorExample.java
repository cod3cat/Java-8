package com.learn.java.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = (s) -> s.concat("default");

    public static void main(String[] args) {
        unaryOperator.apply("java8");
    }
}
