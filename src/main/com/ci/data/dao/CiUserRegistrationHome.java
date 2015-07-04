package com.ci.data.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ci.data.UserRegistration;

/**
 * Home object for domain model class CiUserRegistration.
 * @see .CiUserRegistration
 * @author itspritish
 */
public class CiUserRegistrationHome {

	private static final Log log = LogFactory
			.getLog(CiUserRegistrationHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserRegistration transientInstance) {
		log.debug("persisting CiUserRegistration instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserRegistration persistentInstance) {
		log.debug("removing CiUserRegistration instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserRegistration merge(UserRegistration detachedInstance) {
		log.debug("merging CiUserRegistration instance");
		try {
			UserRegistration result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserRegistration findById(int id) {
		log.debug("getting CiUserRegistration instance with id: " + id);
		try {
			UserRegistration instance = entityManager.find(
					UserRegistration.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
