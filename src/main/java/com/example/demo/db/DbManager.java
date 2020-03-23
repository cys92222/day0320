package com.example.demo.db;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.ScheduleVo;
import com.example.demo.vo.CartVo;
import com.example.demo.vo.ChatVo;
import com.example.demo.vo.GoodsVo;
import com.example.demo.vo.MemberVo;

public class DbManager {
	private static SqlSessionFactory factory;
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/example/demo/db/sqlmapconfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
	public static MemberVo isMember(MemberVo m) {
		MemberVo r = null;
		SqlSession session = factory.openSession();
		r = session.selectOne("member.isMember", m);
		session.close();
		return r;
	}
	
	public static int insert(CartVo c) {
		SqlSession session = factory.openSession();
		int re = session.insert("goods.insert", c);
		session.commit();
		session.close();
		return re;
	}
	
	
	public static int insertSchedule(ScheduleVo s) {
		SqlSession session = factory.openSession();
		int re = -1;
		re = session.insert("schedule.insert", s);
		session.commit();
		session.close();
		return re;
	}
	
	public static List<ScheduleVo> listSchedule(){
		SqlSession session = factory.openSession();
		List<ScheduleVo> list = session.selectList("schedule.selectAll");
		session.close();
		return list;
	}
	
	public static int insertChat(ChatVo c) {
		SqlSession session = factory.openSession();
		int re = -1;
		re = session.insert("chat.insert", c);
		session.commit();
		session.close();
		return re;
	}
	
	public static List<ChatVo> listChat(){
		SqlSession session = factory.openSession();
		List<ChatVo> list = session.selectList("chat.selectAll");
		session.close();
		return list;
	}
	
	public static List<GoodsVo> listAll(){
		SqlSession session = factory.openSession();
		List<GoodsVo> list = session.selectList("goods.selectAll");
		session.close();
		return list;
	}
	
}
