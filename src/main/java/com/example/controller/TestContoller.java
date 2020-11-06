package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class TestContoller {


	@RequestMapping("/5")
	public String toFive() {
		return "five";
	}

	@RequestMapping("/10")
	public String toTen() {
		return "ten";
	}

}
