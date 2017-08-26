package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@Autowired
	ConsumerRepository consumerRepository;

	@RequestMapping("/")
	public String welcomePage(Model model) {
		model.addAttribute("message", consumerRepository.getResponseFromEurekaClient());
		return "welcome";
	}

}
