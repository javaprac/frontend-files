package com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.login.constants.LoginRegistrationConstants;

import static com.login.constants.RequestMappings.LOAD_REG_CONTROLLER;
import static com.login.constants.Views.LOAD_REG_CONTROLLER_SUCCESS;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoadRegistrationController extends BaseController {
	
	@RequestMapping(LOAD_REG_CONTROLLER)
	public String loadRegistrationController(HttpServletRequest request) {
		loadHeader(request, LoginRegistrationConstants.NEW_USER_REGISTRATION);
		
		return LOAD_REG_CONTROLLER_SUCCESS;
	}

}
