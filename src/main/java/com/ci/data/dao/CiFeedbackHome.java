package com.ci.data.dao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ci.data.Feedback;

/**
 * Home object for domain model class CiFeedback.
 * @see .CiFeedback
 * @author itspritish
 */
public class CiFeedbackHome {

	private static final Log log = LogFactory.getLog(CiFeedbackHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Feedback transientInstance) {
		log.debug("persisting CiFeedback instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Feedback persistentInstance) {
		log.debug("removing CiFeedback instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Feedback merge(Feedback detachedInstance) {
		log.debug("merging CiFeedback instance");
		try {
			Feedback result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Feedback findById(int id) {
		log.debug("getting CiFeedback instance with id: " + id);
		try {
			Feedback instance = entityManager.find(Feedback.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
