package com.ci.data.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class CiWallet.
 * @see .CiWallet
 * @author itspritish
 */
public class CiWalletHome {

	private static final Log log = LogFactory.getLog(CiWalletHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Wallet transientInstance) {
		log.debug("persisting CiWallet instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Wallet persistentInstance) {
		log.debug("removing CiWallet instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Wallet merge(Wallet detachedInstance) {
		log.debug("merging CiWallet instance");
		try {
			Wallet result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Wallet findById(int id) {
		log.debug("getting CiWallet instance with id: " + id);
		try {
			Wallet instance = entityManager.find(Wallet.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
