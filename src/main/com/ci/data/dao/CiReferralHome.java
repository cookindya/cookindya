package com.ci.data.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CiReferral.
 * @see .CiReferral
 * @author itspritish
 */
public class CiReferralHome {

	private static final Log log = LogFactory.getLog(CiReferralHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Referral transientInstance) {
		log.debug("persisting CiReferral instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Referral persistentInstance) {
		log.debug("removing CiReferral instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Referral merge(Referral detachedInstance) {
		log.debug("merging CiReferral instance");
		try {
			Referral result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Referral findById(int id) {
		log.debug("getting CiReferral instance with id: " + id);
		try {
			Referral instance = entityManager.find(Referral.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
