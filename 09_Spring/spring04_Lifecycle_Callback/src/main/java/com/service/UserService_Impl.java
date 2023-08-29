package com.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserService_Impl implements InitializingBean, DisposableBean {

	public UserService_Impl() {
		System.out.println("UserService 생성자");
	}

	@Override // DisposableBean
	public void destroy() throws Exception {
		System.out.println("DisposableBean.destroy()");
	}
	
	@Override // InitializingBean
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean.afterPropertiesSet()");
	}

}
