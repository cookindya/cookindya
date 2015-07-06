package com.ci.data.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ci.util.HibernateUtil;

public abstract class CookIndyaDaoImpl<T extends Serializable> implements CookIndyaDao<T>{

	private final Class<T> clas;
	private static final Log log = LogFactory.getLog(CookIndyaDaoImpl.class);
	SessionFactory sessionFactory;
	
	public CookIndyaDaoImpl(final Class<T> clasInput) {
		super();
		this.clas = clasInput;
		sessionFactory = HibernateUtil.getSessionFactory();
	}


	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public T getById(Long id) {
		Transaction tx = this.getCurrentSession().beginTransaction();
		T entity = (T) this.getCurrentSession().get(this.clas, new Integer(id.toString()));
		tx.commit();
		return entity;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll() {
		return  this.getCurrentSession().createQuery("from"+this.clas.getName()).list();
	}

	@Override
	public Integer create(T entity) {
		Transaction tx = this.getCurrentSession().beginTransaction();
		Integer id = (Integer) this.getCurrentSession().save(entity);
		tx.commit();
		return id;
	}

	@Override
	public void update(T entity) {
		this.getCurrentSession().save(entity);
	}

	@Override
	public void delete(T entity) {
		this.getCurrentSession().delete(entity);		
	}

	@Override
	public void deleteById(Long id) {

		T entity = this.getById(id);
		delete(entity);
	}

	@Override
	public String createLookup(T entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T saveOrUpdate(T entity) {
		this.getCurrentSession().clear();
		return (T) this.getCurrentSession().save(entity);
	}

	@Override
	public void clear() {
		this.getCurrentSession().clear();
		
	}

	protected final Session getCurrentSession(){
		
		return this.sessionFactory.getCurrentSession();
	}
}
