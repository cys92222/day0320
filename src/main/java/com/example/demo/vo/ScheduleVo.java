package com.example.demo.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ScheduleVo {
	private int no;
	private String event_name;
	private String event_date;
}
