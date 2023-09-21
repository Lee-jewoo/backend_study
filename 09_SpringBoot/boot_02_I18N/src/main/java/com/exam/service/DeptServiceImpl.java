package com.exam.service;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

@Service("service")
public class DeptServiceImpl {
	
	@Autowired
	MessageSource ctx;
	
	public void mesg() {
		String mesg = ctx.getMessage("greeting", null, null, Locale.KOREA);
		System.out.println(mesg);
		String mesg2 = ctx.getMessage("greeting", null, null, Locale.US);
		System.out.println(mesg2);
		String mesg3 = ctx.getMessage("greeting", null, null, Locale.CHINA);
		System.out.println(mesg3);
	}

}
