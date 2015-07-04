package com.ci.data.dao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CiOrder.
 * @see .CiOrder
 * @author itspritish
 */
public class CiOrderHome {

	private static final Log log = LogFactory.getLog(CiOrderHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Order transientInstance) {
		log.debug("persisting CiOrder instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Order persistentInstance) {
		log.debug("removing CiOrder instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Order merge(Order detachedInstance) {
		log.debug("merging CiOrder instance");
		try {
			Order result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Order findById(int id) {
		log.debug("getting CiOrder instance with id: " + id);
		try {
			Order instance = entityManager.find(Order.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
