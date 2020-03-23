package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.GoodsDao;
import com.example.demo.vo.CartVo;
import com.google.gson.Gson;

@RestController
public class GoodsController {
	
	@Autowired
	private GoodsDao dao;
	
	public void setDao(GoodsDao dao) {
		this.dao = dao;
	}

	@RequestMapping("insert")
	public String insert(CartVo c) {
		String str = "";
		int re = dao.insert(c);
		Gson gson = new Gson();
		str = gson.toJson(re);
		System.out.println("장바구니에 담긴 상품번호 : "+c.getGno());
		return str;
	}
	
	@RequestMapping(value = "/goodsList", produces = "application/json;charset=UTF-8")
	public String goodsList() {
		return (new Gson()).toJson(dao.listAll());
	}
}
