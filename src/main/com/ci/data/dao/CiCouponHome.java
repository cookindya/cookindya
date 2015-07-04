package com.ci.data.dao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ci.data.Coupon;

/**
 * Home object for domain model class CiCoupon.
 * @see .CiCoupon
 * @author itspritish
 */
public class CiCouponHome {

	private static final Log log = LogFactory.getLog(CiCouponHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Coupon transientInstance) {
		log.debug("persisting CiCoupon instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Coupon persistentInstance) {
		log.debug("removing CiCoupon instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Coupon merge(Coupon detachedInstance) {
		log.debug("merging CiCoupon instance");
		try {
			Coupon result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Coupon findById(int id) {
		log.debug("getting CiCoupon instance with id: " + id);
		try {
			Coupon instance = entityManager.find(Coupon.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
