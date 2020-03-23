package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.db.DbManager;
import com.example.demo.vo.CartVo;
import com.example.demo.vo.GoodsVo;

@Repository
public class GoodsDao {
	
	public List<GoodsVo> listAll(){
		return DbManager.listAll();
	}
	
	public int insert(CartVo c) {
		return DbManager.insert(c);
	}
}
