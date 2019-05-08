package com.example.demo.persistence;

import com.example.demo.domain.Board;

public interface BoardDAO {

	public int insert(Board board) throws Exception;
}
