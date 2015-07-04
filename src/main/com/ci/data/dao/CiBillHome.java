package com.ci.data.dao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**
 * Home object for domain model class CiBill.
 * @see .CiBill
 * @author itspritish
 */
public class CiBillHome {

	private static final Log log = LogFactory.getLog(CiAddressHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Bill transientInstance) {
		log.debug("persisting CiBill instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Bill persistentInstance) {
		log.debug("removing CiBill instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Bill merge(Bill detachedInstance) {
		log.debug("merging CiBill instance");
		try {
			Bill result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Bill findById(int id) {
		log.debug("getting CiBill instance with id: " + id);
		try {
			Bill instance = entityManager.find(Bill.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
