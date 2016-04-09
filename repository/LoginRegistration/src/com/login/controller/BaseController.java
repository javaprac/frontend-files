package com.login.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.login.constants.LoginRegistrationConstants;

@Component
public class BaseController {
	
	public void loadHeader(HttpServletRequest request, String message){
		request.removeAttribute(LoginRegistrationConstants.HEADER_MSG);
		request.setAttribute(LoginRegistrationConstants.HEADER_MSG, message);
	}
}
