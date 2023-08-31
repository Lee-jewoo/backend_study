package com.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

// aspect : target의 메서드를 호출할 때 위빙
@Aspect
public class Aspect_afterthrowing {
	
	@Pointcut("execution(public String sayEcho())")
	public void xxx() {}
	
	// 예외가 발생했을 때 위빙
	@AfterThrowing(pointcut="xxx()", throwing="e") // 예외 변수 지정 (e)
	public void afterThrowingAspect(Exception e) { // 예외를 저장할 변수
		System.out.println("AfterThrowing Aspect 예외 정보 : " + e.getMessage());
	}
	
}
