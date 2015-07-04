package com.ci.data.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CiFame.
 * @see .CiFame
 * @author itspritish
 */
public class CiFameHome {

	private static final Log log = LogFactory.getLog(CiFameHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Fame transientInstance) {
		log.debug("persisting CiFame instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Fame persistentInstance) {
		log.debug("removing CiFame instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Fame merge(Fame detachedInstance) {
		log.debug("merging CiFame instance");
		try {
			Fame result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Fame findById(int id) {
		log.debug("getting CiFame instance with id: " + id);
		try {
			Fame instance = entityManager.find(Fame.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
