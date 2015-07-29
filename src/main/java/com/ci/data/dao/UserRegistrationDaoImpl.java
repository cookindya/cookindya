package com.ci.data.dao;

import org.hibernate.Transaction;

import com.ci.data.UserInfo;
import com.ci.data.UserRegistration;

public class UserRegistrationDaoImpl  extends CookIndyaDaoImpl<UserRegistration> implements UserRegistrationDao{

	public UserRegistrationDaoImpl(Class<UserRegistration> clasInput) {
		super(clasInput);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String registerNewUser(UserRegistration userRegsData) {		
		Transaction tx = this.getCurrentSession().beginTransaction();		
		UserInfo userinfo = new UserInfo();
		userinfo.setUserName(userRegsData.getUserName());
		userRegsData.setUserInfo(userinfo);
		userinfo.setUserRegistration(userRegsData);
		Integer id = (Integer) this.getCurrentSession().save(userRegsData);
		tx.commit();
		return null;
	}
}
