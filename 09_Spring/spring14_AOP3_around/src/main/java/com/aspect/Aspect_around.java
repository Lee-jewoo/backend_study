package com.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

// aspect : target의 메서드를 호출할 때 위빙
@Aspect
public class Aspect_around {
	
	@Pointcut("execution(public String sayEcho())")
	public void xxx() {}
	
	// 호출 전, 후, 정상 리턴, 예외 발생시 위빙
	@Around(value="xxx()")
	public Object aroundAspect(ProceedingJoinPoint pjp) throws Throwable { // AfterThrowing 역할
		System.out.println("Around Aspect");
		System.out.println("Before 역할");
		Object obj = pjp.proceed(); // 메서드 호출 -> 리턴값은 obj에 저장
		System.out.println("After 역할");
		System.out.println("AfterReturning 역할 : " + obj);
		return obj; // 호출한 곳으로 obj 리턴
	}
	
}
