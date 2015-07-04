package com.ci.data.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ci.data.Rating;

/**
 * Home object for domain model class CiRating.
 * @see .CiRating
 * @author itspritish
 */
public class CiRatingHome {

	private static final Log log = LogFactory.getLog(CiRatingHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Rating transientInstance) {
		log.debug("persisting CiRating instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Rating persistentInstance) {
		log.debug("removing CiRating instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Rating merge(Rating detachedInstance) {
		log.debug("merging CiRating instance");
		try {
			Rating result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Rating findById(int id) {
		log.debug("getting CiRating instance with id: " + id);
		try {
			Rating instance = entityManager.find(Rating.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
