package com.exam.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BeforeAspect {
	
	@Pointcut("execution(public String sayEcho())")
	public void xxx() {}
	
	// 부수 기능
	@Before("xxx()")
	public void method() {
		System.out.println("BeforeAspect.method");
	}

}
