package com.login.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.login.constants.LoginRegistrationConstants;
import com.login.forms.RegistrationForm;
import static com.login.constants.RequestMappings.REG_STEP_TWO_CONTROLLER;
import static com.login.constants.Views.REG_STEP_2_CONTROLLER_SUCCESS;

@Controller
public class RegistrationStepTwoController extends BaseController {
	
	@RequestMapping(REG_STEP_TWO_CONTROLLER)
	public String regStepTwo(RegistrationForm form, BindingResult bindingResult, HttpServletRequest request){
		String userId = form.getUserName();
		String message = LoginRegistrationConstants.CREATE_USER + userId;
		loadHeader(request, message);
		return REG_STEP_2_CONTROLLER_SUCCESS;
	}
}
