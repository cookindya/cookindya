package com.ci.data.dao;

import java.io.Serializable;
import java.util.List;

public interface CookIndyaDao<T extends Serializable>{

	public T getById(final Long id);
	public List<T> getAll();
	public Integer create(final T entity);
	public void update(final T entity);
	public void delete(final T entity);
	public void deleteById(final Long id);
	public String createLookup(final T entity);
	public T saveOrUpdate(final T entity);
	public void clear();
}
