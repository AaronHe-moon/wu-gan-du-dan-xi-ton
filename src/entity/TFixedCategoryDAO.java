package entity;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * Data access object (DAO) for domain model class TFixedCategory.
 * 
 * @see entity.TFixedCategory
 * @author MyEclipse Persistence Tools
 */

public class TFixedCategoryDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(TFixedCategoryDAO.class);

	public void save(TFixedCategory transientInstance) {
		log.debug("saving TFixedCategory instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TFixedCategory persistentInstance) {
		log.debug("deleting TFixedCategory instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TFixedCategory findById(java.lang.Integer id) {
		log.debug("getting TFixedCategory instance with id: " + id);
		try {
			TFixedCategory instance = (TFixedCategory) getSession().get(
					"entity.TFixedCategory", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TFixedCategory instance) {
		log.debug("finding TFixedCategory instance by example");
		try {
			List results = getSession().createCriteria("entity.TFixedCategory")
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
		log.debug("finding TFixedCategory instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TFixedCategory as model where model."
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
		log.debug("finding all TFixedCategory instances");
		try {
			String queryString = "from TFixedCategory";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TFixedCategory merge(TFixedCategory detachedInstance) {
		log.debug("merging TFixedCategory instance");
		try {
			TFixedCategory result = (TFixedCategory) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TFixedCategory instance) {
		log.debug("attaching dirty TFixedCategory instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TFixedCategory instance) {
		log.debug("attaching clean TFixedCategory instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}