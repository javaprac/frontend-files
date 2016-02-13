package com.login.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.login.forms.RegistrationStepOneForm;
import static com.login.constants.RequestMappings.REG_STEP_TWO_CONTROLLER;
import static com.login.constants.Views.REG_STEP_2_CONTROLLER_SUCCESS;

@Controller
public class RegistrationStepTwoController {
	
	@RequestMapping(REG_STEP_TWO_CONTROLLER)
	public String regStepTwo(RegistrationStepOneForm form, BindingResult bindingResult, HttpServletRequest request){
		request.setAttribute("form", form);
		return REG_STEP_2_CONTROLLER_SUCCESS;
	}
}
