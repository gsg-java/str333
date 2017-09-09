package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repository.PortfolioRepository;
import com.example.demo.service.PortfolioService;

@Controller
public class TestModelController {

	@Autowired
	private PortfolioService portfolioService;

	// url 에 http://localhost:8080/h2-console
	// 이런식으로 접근하면 db 볼 수 있음.

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("portfolios", portfolioService.findAll());

		// List<Portfolio> list = new ArrayList<>();
		//
		// list.add(new Portfolio("img/portfolio/cabin.png"));
		// list.add(new Portfolio("img/portfolio/cake.png"));
		// list.add(new Portfolio("img/portfolio/circus.png"));
		// list.add(new Portfolio("img/portfolio/game.png"));
		// list.add(new Portfolio("img/portfolio/safe.png"));
		// list.add(new Portfolio("img/portfolio/submarine.png"));
		// model.addAttribute("portfolios", list);

		return "home";
	}

}
