package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.domain.Member;
import com.example.demo.persistence.MemberDAO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestApplicationTests3 {

	@Autowired
	private MemberDAO dao;

	
	@Test
	public void sqlSessionTest() throws Exception{
		Member member = new Member("user3", "user3", "user3", "user3mail");
		
		dao.create(member);
		
	}

}
