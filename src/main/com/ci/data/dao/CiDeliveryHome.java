package com.ci.data.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CiDelivery.
 * @see .CiDelivery
 * @author itspritish
 */
public class CiDeliveryHome {

	private static final Log log = LogFactory.getLog(CiDeliveryHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Delivery transientInstance) {
		log.debug("persisting CiDelivery instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Delivery persistentInstance) {
		log.debug("removing CiDelivery instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Delivery merge(Delivery detachedInstance) {
		log.debug("merging CiDelivery instance");
		try {
			Delivery result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Delivery findById(int id) {
		log.debug("getting CiDelivery instance with id: " + id);
		try {
			Delivery instance = entityManager.find(Delivery.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
