package entity;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * Data access object (DAO) for domain model class TUserDocRecord.
 * 
 * @see entity.TUserDocRecord
 * @author MyEclipse Persistence Tools
 */

public class TUserDocRecordDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TUserDocRecordDAO.class);

	public void save(TUserDocRecord transientInstance) {
		log.debug("saving TUserDocRecord instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TUserDocRecord persistentInstance) {
		log.debug("deleting TUserDocRecord instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TUserDocRecord findById(java.lang.Integer id) {
		log.debug("getting TUserDocRecord instance with id: " + id);
		try {
			TUserDocRecord instance = (TUserDocRecord) getSession().get(
					"entity.TUserDocRecord", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TUserDocRecord instance) {
		log.debug("finding TUserDocRecord instance by example");
		try {
			List results = getSession().createCriteria("entity.TUserDocRecord")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TUserDocRecord instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TUserDocRecord as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all TUserDocRecord instances");
		try {
			String queryString = "from TUserDocRecord";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TUserDocRecord merge(TUserDocRecord detachedInstance) {
		log.debug("merging TUserDocRecord instance");
		try {
			TUserDocRecord result = (TUserDocRecord) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TUserDocRecord instance) {
		log.debug("attaching dirty TUserDocRecord instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TUserDocRecord instance) {
		log.debug("attaching clean TUserDocRecord instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}