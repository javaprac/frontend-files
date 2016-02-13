package com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.login.constants.RequestMappings.REG_STEP_THREE_CONTROLLER;

@Controller
public class RegistrationStepThreeController {
	@RequestMapping(REG_STEP_THREE_CONTROLLER)
	public String registrationStep3(){
		
	}
}
