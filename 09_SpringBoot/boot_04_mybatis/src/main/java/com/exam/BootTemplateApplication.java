package com.exam;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.exam.dto.DeptDTO;
import com.exam.service.DeptService;

@SpringBootApplication
public class BootTemplateApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootTemplateApplication.class, args);
		DeptService service = ctx.getBean("service", DeptService.class);
		List<DeptDTO> list = service.deptList();
		for (DeptDTO deptDTO : list) {
			System.out.println(deptDTO); 
		}
		
	}

}
