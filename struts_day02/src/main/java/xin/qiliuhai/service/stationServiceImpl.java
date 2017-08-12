package xin.qiliuhai.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import xin.qiliuhai.Utils.HibernateUtils;
import xin.qiliuhai.domain.riverInfo;
import xin.qiliuhai.domain.stationInfo;

public class stationServiceImpl implements stationService {

	@Override
	public List<stationInfo> getAll(String riverId) {
		Session session = HibernateUtils.getSession();
		System.out.println("riverId"+riverId);
		Transaction tr = session.beginTransaction();
		// 使用的是类名而不是表名
		Query query = session.createQuery("from stationInfo where riverId=?");
		query.setParameter(0,Long.valueOf(riverId));
		List<stationInfo> list = query.list();
		tr.commit();
		return list;
	}
	public List<stationInfo> getAll() {
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		// 使用的是类名而不是表名
		Query query = session.createQuery("from stationInfo order by stationId");
		query.setFirstResult(0);
		query.setMaxResults(10);
		List<stationInfo> list = query.list();
		tr.commit();
		return list;
	}
	public List<stationInfo> getNextPage(String stationId) {
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		// 使用的是类名而不是表名
		Query query = session.createQuery("from stationInfo where stationId > ? order by stationId");
		query.setParameter(0, Long.valueOf(stationId));
		query.setFirstResult(0);
		query.setMaxResults(10);
		List<stationInfo> list = query.list();
		tr.commit();
		return list;
	}
	public List<stationInfo> getLastPage(String stationId) {
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		// 使用的是类名而不是表名
		Query query = session.createQuery("from stationInfo where stationId < ? order by stationId");
		query.setParameter(0, Long.valueOf(stationId));
		query.setFirstResult(0);
		query.setMaxResults(10);
		List<stationInfo> list = query.list();
		tr.commit();
		return list;		
	}

}
