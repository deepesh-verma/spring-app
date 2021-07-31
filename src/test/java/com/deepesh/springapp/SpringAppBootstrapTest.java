package com.deepesh.springapp;

import org.junit.jupiter.api.Test;

import static com.deepesh.springapp.SpringAppBootstrap.HELLO_SPRING;
import static org.junit.jupiter.api.Assertions.*;

class SpringAppBootstrapTest {

    private final SpringAppBootstrap target = new SpringAppBootstrap();

    @Test
    void whenCalledGetGreeting_shouldReturnGreetingMessage() {
        assertEquals(HELLO_SPRING, target.getGreeting());
    }
}