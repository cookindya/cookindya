package com.ci.data.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ci.data.PaymentTypes;

/**
 * Home object for domain model class PaymentTypes.
 * @see .PaymentTypes
 * @author itspritish
 */
public class PaymentTypesHome {

	private static final Log log = LogFactory.getLog(PaymentTypesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(PaymentTypesHome transientInstance) {
		log.debug("persisting PaymentTypes instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(PaymentTypes persistentInstance) {
		log.debug("removing PaymentTypes instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public PaymentTypes merge(PaymentTypes detachedInstance) {
		log.debug("merging PaymentTypes instance");
		try {
			PaymentTypes result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public PaymentTypes findById(int id) {
		log.debug("getting PaymentTypes instance with id: " + id);
		try {
			PaymentTypes instance = entityManager.find(PaymentTypes.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
