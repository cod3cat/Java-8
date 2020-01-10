package com.learn.java.functionalInterfaces;

public class FunctionInterfaceExample1 {

    private static String performConcat(){
        return FunctionExample.addSomeString.apply("Hello");
    }

    public static void main(String[] args) {
        System.out.println(performConcat());
    }
}
