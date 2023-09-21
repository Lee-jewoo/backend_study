package com.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.exam.service.DeptServiceImpl;


@SpringBootApplication
public class BootTemplateApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootTemplateApplication.class, args);
		DeptServiceImpl service = ctx.getBean("service", DeptServiceImpl.class);
		System.out.println(service.list());
	}

}
