package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TestModelController {

	@GetMapping("/")
	public String home(Model model) {
        return "redirect:/helloworld";
    }
	
	@GetMapping("/helloworld")
	public String helloworld(Model model) {
//        model.addAttribute("test", "aaaasbbbssss");
        return "helloworld";
    }
}
