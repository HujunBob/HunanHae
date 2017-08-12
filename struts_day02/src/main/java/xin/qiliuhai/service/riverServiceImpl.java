package xin.qiliuhai.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import xin.qiliuhai.Utils.HibernateUtils;
import xin.qiliuhai.domain.riverInfo;

public class riverServiceImpl implements riverService {

	@Override
	public List<riverInfo> getAll() {
		Session session = HibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		// 使用的是类名而不是表名
		Query query = session.createQuery("from riverInfo  order by riverid ");
		List<riverInfo> list = query.list();
		
		tr.commit();
		return list;
	}

}
