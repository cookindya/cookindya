package com.ci.data.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CiOffers.
 * @see .CiOffers
 * @author itspritish
 */
public class CiOffersHome {

	private static final Log log = LogFactory.getLog(CiOffersHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Offers transientInstance) {
		log.debug("persisting CiOffers instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Offers persistentInstance) {
		log.debug("removing CiOffers instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Offers merge(Offers detachedInstance) {
		log.debug("merging CiOffers instance");
		try {
			Offers result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Offers findById(int id) {
		log.debug("getting CiOffers instance with id: " + id);
		try {
			Offers instance = entityManager.find(Offers.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
