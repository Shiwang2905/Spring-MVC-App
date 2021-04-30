package com.shiwang.main;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@InitBinder
	public void checkWhiteSpaces(WebDataBinder webBinder) {
		StringTrimmerEditor trimparameters = new StringTrimmerEditor(true);
		webBinder.registerCustomEditor(String.class, trimparameters);
	}

	@RequestMapping("/userform")
	public String readUserData(Model usermodel) {

		User firstuser = new User();
		usermodel.addAttribute("tempuser", firstuser);

		return "UserForm";
	}

	@RequestMapping("/processUserForm")
	public String processParameter(@Valid @ModelAttribute("tempuser") User user, BindingResult bindingresult) {

		if (bindingresult.hasErrors()) {
			return "UserForm";
		} else {
			return "welcome-user";
		}

	}

}
