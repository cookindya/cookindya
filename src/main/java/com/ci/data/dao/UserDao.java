package com.ci.data.dao;

import java.util.List;

import com.ci.data.UserInfo;

public interface UserDao extends CookIndyaDao<UserInfo>{
	
	public List<UserInfo> getAllCooks();
}
