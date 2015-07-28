package com.ci.data.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Transaction;

import com.ci.data.UserInfo;
import com.ci.data.UserRegistration;

@Transactional
public class UserDaoImpl extends CookIndyaDaoImpl<UserInfo> implements UserDao{


	public UserDaoImpl(Class<UserInfo> clasInput) {
		super(clasInput);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UserInfo> getAllCooks() {

		Query getAllCooks = (Query) this.getCurrentSession().getNamedQuery("getAllCooks").setString(1, "Y");
		return (List<UserInfo>)getAllCooks.getResultList();
	}

	

}
