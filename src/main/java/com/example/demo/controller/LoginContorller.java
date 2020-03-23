package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginContorller {
	
	@RequestMapping("/login.do")
	public String login(String name, int age) {
		System.out.println("컨트롤러 동작함");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		return "loginOK";
	}
}
