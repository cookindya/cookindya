package com.ci.data.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CiPaymentTypes.
 * @see .CiPaymentTypes
 * @author itspritish
 */
public class CiPaymentTypesHome {

	private static final Log log = LogFactory.getLog(CiPaymentTypesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CiPaymentTypesHome transientInstance) {
		log.debug("persisting CiPaymentTypes instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CiPaymentTypes persistentInstance) {
		log.debug("removing CiPaymentTypes instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CiPaymentTypes merge(CiPaymentTypes detachedInstance) {
		log.debug("merging CiPaymentTypes instance");
		try {
			CiPaymentTypes result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CiPaymentTypes findById(int id) {
		log.debug("getting CiPaymentTypes instance with id: " + id);
		try {
			CiPaymentTypes instance = entityManager.find(CiPaymentTypes.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
