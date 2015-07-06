package com.ci.data.dao;

import java.io.Serializable;
import java.util.List;

public interface UserDao<T extends Serializable> extends CookIndyaDao<T>{
	
	public List<T> getAllCooks();
}
