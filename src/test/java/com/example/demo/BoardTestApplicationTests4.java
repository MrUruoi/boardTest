package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.domain.Board;
import com.example.demo.persistence.BoardDAO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestApplicationTests4 {

	@Autowired
	private BoardDAO dao;

	
	@Test
	public void sqlSessionTest() throws Exception{
		Board board = new Board();
		board.setUserid("user1");
		board.setTitle("tititieeee");
		board.setContent("ccccccccc");
		
		dao.insert(board);
		
	}

}
