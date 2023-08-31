package com.aspect;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

// aspect : target의 메서드를 호출할 때 위빙
@org.aspectj.lang.annotation.Aspect
public class Aspect {
	
	@Pointcut("execution(public String sayEcho())")
	public void xxx() {}
	
	@Before("xxx()")
	public void beforeAspect() {
		System.out.println("beforeAspect");
	}
	
	@Before("execution(* callEcho(..))")
	public void beforeAspect2() {
		System.out.println("beforeAspect");
	}

}
