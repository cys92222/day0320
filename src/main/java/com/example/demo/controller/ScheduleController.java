package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.DbManager;
import com.example.demo.vo.ScheduleVo;
import com.google.gson.Gson;

@RestController
public class ScheduleController {
	
	@RequestMapping("/insertSchedule")
	public String chatInsert(ScheduleVo s) {
		String str = "ok";
		DbManager.insertSchedule(s);
		return str;
	}
	
	@RequestMapping(value = "/listSchedule", produces = "Application/json;charset=UTF-8")
	public String chatList() {
		return (new Gson()).toJson( DbManager.listSchedule() );
	}
}
