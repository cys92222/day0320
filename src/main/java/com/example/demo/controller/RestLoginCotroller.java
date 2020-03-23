package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//data 응답
@RestController
public class RestLoginCotroller {
	
	@RequestMapping(value = "/ActionWidthData", produces = "text/plaine;charset=UTF-8")
	public String actionWithData(String name, int age) {
		String str = "";
		System.out.println("Ajax 통신입니다");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		str = "<h2>로그인 하였습니다</h2>";
		return str;
	}
}
