package com.ci.data.dao;

package com.ci.data.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ci.data.Kitchen;

/**
 * Home object for domain model class CiKitchen.
 * @see .CiKitchen
 * @author itspritish
 */
public class CiKitchenHome {

	private static final Log log = LogFactory.getLog(CiKitchenHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Kitchen transientInstance) {
		log.debug("persisting CiKitchen instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Kitchen persistentInstance) {
		log.debug("removing CiKitchen instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Kitchen merge(Kitchen detachedInstance) {
		log.debug("merging CiKitchen instance");
		try {
			Kitchen result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Kitchen findById(int id) {
		log.debug("getting CiKitchen instance with id: " + id);
		try {
			Kitchen instance = entityManager.find(Kitchen.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
