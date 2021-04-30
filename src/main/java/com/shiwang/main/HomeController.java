package com.shiwang.main;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping("/queryForm")
	public String showQueryPage() {
		return "Querypage";
	}

	@RequestMapping("/processForm")
	public String convertToUpperCase(HttpServletRequest request, Model model) {
		String name = request.getParameter("Username");
		name = name.toUpperCase();
		model.addAttribute("convertedName", name);

		List<String> userCart = new ArrayList<>();
		userCart.add("bread");
		userCart.add("1");
		userCart.add("40");

		model.addAttribute("shoppingCart", userCart);

		return "welcome";
	}

	@RequestMapping("/processFormTypeTwo")
	public String processParameter(@RequestParam("Username") String personName, Model model) {
		personName = personName.toUpperCase();
		model.addAttribute("convertedName", personName);

		List<String> userCart = new ArrayList<>();
		userCart.add("bread");
		userCart.add("1");
		userCart.add("40");

		model.addAttribute("shoppingCart", userCart);
		return "welcome";
	}

}
