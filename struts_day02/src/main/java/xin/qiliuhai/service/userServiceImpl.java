package xin.qiliuhai.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import xin.qiliuhai.Utils.HibernateUtils;
import xin.qiliuhai.domain.userInfo;

public class userServiceImpl implements userService {

	@Override
	public List<userInfo> getAll() {
		Session session = HibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		// 使用的是类名而不是表名
		Query query = session.createQuery("from userInfo ");
		List<userInfo> list = query.list();
		tr.commit();
		return list;
	}

}
