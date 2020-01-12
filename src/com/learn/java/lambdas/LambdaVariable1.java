package com.learn.java.lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {

    public static void main(String[] args) {

        int i = 1;
        Consumer<Integer> c1 = (integer -> System.out.println(i));

        c1.accept(i);
    }
}
