package com.ci.data.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ci.data.UserRoles;

/**
 * Home object for domain model class CiUserRoles.
 * @see .CiUserRoles
 * @author itspritish
 */
public class CiUserRolesHome {

	private static final Log log = LogFactory.getLog(CiUserRolesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(UserRoles transientInstance) {
		log.debug("persisting CiUserRoles instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(UserRoles persistentInstance) {
		log.debug("removing CiUserRoles instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public UserRoles merge(UserRoles detachedInstance) {
		log.debug("merging CiUserRoles instance");
		try {
			UserRoles result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public UserRoles findById(int id) {
		log.debug("getting CiUserRoles instance with id: " + id);
		try {
			UserRoles instance = entityManager.find(UserRoles.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
