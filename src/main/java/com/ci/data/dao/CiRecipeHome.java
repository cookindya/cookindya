package com.ci.data.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ci.api.Recipe;

/**
 * Home object for domain model class CiRecipe.
 * @see .CiRecipe
 * @author itspritish
 */
public class CiRecipeHome {

	private static final Log log = LogFactory.getLog(CiRecipeHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Recipe transientInstance) {
		log.debug("persisting CiRecipe instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Recipe persistentInstance) {
		log.debug("removing CiRecipe instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Recipe merge(Recipe detachedInstance) {
		log.debug("merging CiRecipe instance");
		try {
			Recipe result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Recipe findById(int id) {
		log.debug("getting CiRecipe instance with id: " + id);
		try {
			Recipe instance = entityManager.find(Recipe.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
