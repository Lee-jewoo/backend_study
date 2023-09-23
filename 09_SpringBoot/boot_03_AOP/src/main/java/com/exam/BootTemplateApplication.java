package com.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.exam.service.UserService;

@SpringBootApplication
@EnableAspectJAutoProxy
public class BootTemplateApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootTemplateApplication.class, args);
		UserService service = ctx.getBean("service", UserService.class);
		System.out.println(service.sayEcho());	
	}

}
