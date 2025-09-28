package com.example.demo.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloServiceTest {

    @Test
    void testSayHello() {
        HelloService service = new HelloService();
        String result = service.sayHello("John");
        assertEquals("Hello, John", result);
    }
}
