package com.ci.data.dao;

import java.util.List;

import com.ci.data.UserInfo;
import com.ci.data.UserRegistration;

public interface UserDao extends CookIndyaDao<UserInfo>{
	
	public List<UserInfo> getAllCooks();
	public String registerNewUser(UserRegistration userRegsData);
}
