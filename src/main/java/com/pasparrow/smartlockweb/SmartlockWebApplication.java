package com.pasparrow.smartlockweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SmartlockWebApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(SmartlockWebApplication.class, args);
    }

}
