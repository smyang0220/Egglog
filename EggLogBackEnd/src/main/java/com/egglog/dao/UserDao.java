package com.egglog.dao;

import com.egglog.dto.User;


public interface UserDao {
	
	// 유저 정보 불러오기
	public User getUser(String id);
	
	// 회원 가입
	public int insert(User user);
	
	// 회원 탈퇴
	public int deleteUser(String id);
	
	// 회원정보수정
	public int modifyUser(User user);
	
}