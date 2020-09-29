package com.example.spring.boot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
public class MyCommandLineRunner implements CommandLineRunner {
	
	@Autowired
	private ApplicationContext ctx;
	
	@Autowired
	private Environment env;
	
	
    public void run(String... args) {
        // Do something...
    	System.out.print("Application started with command-line arguments ::: " + Arrays.toString(args));
    }
}
