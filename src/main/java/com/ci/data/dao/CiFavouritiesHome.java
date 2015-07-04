package com.ci.data.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ci.data.Favourities;

/**
 * Home object for domain model class CiFavourities.
 * @see .CiFavourities
 * @author itspritish
 */
public class CiFavouritiesHome {

	private static final Log log = LogFactory.getLog(CiFavouritiesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Favourities transientInstance) {
		log.debug("persisting CiFavourities instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Favourities persistentInstance) {
		log.debug("removing CiFavourities instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Favourities merge(Favourities detachedInstance) {
		log.debug("merging CiFavourities instance");
		try {
			Favourities result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Favourities findById(int id) {
		log.debug("getting CiFavourities instance with id: " + id);
		try {
			Favourities instance = entityManager
					.find(Favourities.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
