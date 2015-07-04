package com.ci.data.dao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ci.data.Authorization;

/**
 * Home object for domain model class CiAuthorization.
 * @see .CiAuthorization
 * @author itspritish
 */
public class CiAuthorizationHome {

	private static final Log log = LogFactory.getLog(CiAuthorizationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Authorization transientInstance) {
		log.debug("persisting CiAuthorization instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Authorization persistentInstance) {
		log.debug("removing CiAuthorization instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Authorization merge(Authorization detachedInstance) {
		log.debug("merging CiAuthorization instance");
		try {
			Authorization result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Authorization findById(int id) {
		log.debug("getting CiAuthorization instance with id: " + id);
		try {
			Authorization instance = entityManager.find(
					Authorization.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
