package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

// aspect : target의 메서드를 호출할 때 위빙
@Aspect
public class Aspect_before_after_afterAspect {
	
	@Pointcut("execution(public String sayEcho())")
	public void xxx() {}
	
	@Before("xxx()")
	public void beforeAspect() {
		System.out.println("Before Aspect");
	}
	
	@Before("execution(* callEcho(..))")
	public void beforeAspect2() {
		System.out.println("Before Aspect");
	}
	
	// 메서드 호출 후 리턴값을 리턴했을 때 위빙
	@After("xxx()")
	public void afterAspect(JoinPoint point) {
		System.out.println("호출한 메서드명 : "+ point.getSignature().getName());
		System.out.println("After Aspect");
	}
	
	@After("execution(* callEcho(..))")
	public void afterAspect2(JoinPoint point) {
		System.out.println("호출한 메서드명 : "+ point.getSignature().getName());
		System.out.println("After Aspect");
	}
	
	@AfterReturning(pointcut="xxx()", returning="obj") // obj 변수 지정
	public void AfterReturning(Object obj) { // obj = 메서드가 리턴하는 값 저장
		System.out.println("After Returning 리턴값 : "+ obj);
	}

	@AfterReturning(pointcut="execution(* callEcho(..))", returning="obj") // obj 변수 지정
	public void AfterReturning2(Object obj) { // obj = 메서드가 리턴하는 값 저장
		System.out.println("After Returning 리턴값 : "+ obj);
	}
}
