package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

public class MyFilter implements Filter {

	public void destroy() {
		
		System.out.println("MyFilter.destroy");
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		System.out.println("MyFilter.doFilter 요청 필터");
		chain.doFilter(request, response); // 필터 적용의 기준
		System.out.println("MyFilter.doFilter 응답 필터");
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
		System.out.println("MyFilter.init");

	}

}
