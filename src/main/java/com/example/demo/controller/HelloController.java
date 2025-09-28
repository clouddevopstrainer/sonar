package com.example.demo.controller;

import com.example.demo.service.HelloService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloControllerTest {

    @Test
    void testHelloEndpoint() {
        HelloService service = new HelloService();
        HelloController controller = new HelloController(service);

        String result = controller.sayHello("John");
        assertEquals("Hello, John", result);
    }
}
