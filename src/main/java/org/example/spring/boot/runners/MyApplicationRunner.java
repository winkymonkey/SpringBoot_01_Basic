package org.example.spring.boot.runners;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Component
public class MyApplicationRunner implements ApplicationRunner {
	
	@Autowired
	private ApplicationContext ctx;
	
	@Autowired
	private Environment env;
	
	
	public void run(ApplicationArguments args) throws Exception {
		// Do something...
		System.out.println("Your application started with argument names ---> " + args.getOptionNames());
		System.out.println("Your application started with argument values ---> " + args.getOptionValues("..."));
		System.out.println("Your application started with raw source arguments ---> " + Arrays.toString(args.getSourceArgs()));
	}
}
