package com.ci.data.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CiUserInfo.
 * @see .CiUserInfo
 * @author itspritish
 */
public class CiUserInfoHome {

	private static final Log log = LogFactory.getLog(CiUserInfoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserInfo transientInstance) {
		log.debug("persisting CiUserInfo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserInfo persistentInstance) {
		log.debug("removing CiUserInfo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserInfo merge(UserInfo detachedInstance) {
		log.debug("merging CiUserInfo instance");
		try {
			UserInfo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserInfo findById(int id) {
		log.debug("getting CiUserInfo instance with id: " + id);
		try {
			UserInfo instance = entityManager.find(UserInfo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
