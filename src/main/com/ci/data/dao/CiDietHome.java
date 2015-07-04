package com.ci.data.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ci.data.Diet;

/**
 * Home object for domain model class CiDiet.
 * @see .CiDiet
 * @author itspritish
 */
public class CiDietHome {

	private static final Log log = LogFactory.getLog(CiDietHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Diet transientInstance) {
		log.debug("persisting CiDiet instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Diet persistentInstance) {
		log.debug("removing CiDiet instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Diet merge(Diet detachedInstance) {
		log.debug("merging CiDiet instance");
		try {
			Diet result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Diet findById(int id) {
		log.debug("getting CiDiet instance with id: " + id);
		try {
			Diet instance = entityManager.find(Diet.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
