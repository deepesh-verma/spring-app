package com.deepesh.springapp;

public class SpringAppBootstrap {

    static final String HELLO_SPRING = "Hello Spring !!";

    public static void main(String[] args) {
        System.out.println(new SpringAppBootstrap().getGreeting());
    }

    public String getGreeting() {
        return HELLO_SPRING;
    }
}
