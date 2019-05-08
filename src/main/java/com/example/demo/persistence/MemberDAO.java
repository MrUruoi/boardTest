package com.example.demo.persistence;

import com.example.demo.domain.Member;

public interface MemberDAO {
	
		public void create(Member member) throws Exception;
		
		public Member select(String userid) throws Exception;
		
		public void update(Member member) throws Exception;

		public int delete(String userid) throws Exception;
}
