package com.ci.data.dao;

import com.ci.data.UserRegistration;

public interface UserRegistrationDao extends  CookIndyaDao<UserRegistration> {
	public String registerNewUser(UserRegistration userRegsData);
}
