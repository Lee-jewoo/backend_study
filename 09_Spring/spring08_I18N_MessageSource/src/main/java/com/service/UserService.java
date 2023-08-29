package com.service;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class UserService implements MessageSourceAware {

	MessageSource ctx;
	
	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.ctx = messageSource;
	}
	
	public void info() {
		String mesg_ko = ctx.getMessage("greeting", null, null, Locale.KOREA);
		String mesg_en = ctx.getMessage("greeting", null, null, Locale.ENGLISH);
		System.out.println(mesg_ko+"\t"+mesg_en);
	}

}
