package xin.qiuliuhai.hibernateTest;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import xin.qiliuhai.Utils.HibernateUtils;
import xin.qiliuhai.domain.downRZ;
import xin.qiliuhai.domain.downStation;
import xin.qiliuhai.domain.plantExpectedN;
import xin.qiliuhai.domain.plantHQN;
import xin.qiliuhai.domain.plantInfo;
import xin.qiliuhai.domain.riverInfo;
import xin.qiliuhai.domain.stationInfo;
import xin.qiliuhai.domain.upStation;
import xin.qiliuhai.domain.upZV;
import xin.qiliuhai.domain.userInfo;
import xin.qiliuhai.domain.userType;

public class Demo1 {
	/***
	 * plantInfo基本测试
	 */
	@Test
	public void run11() {
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		// 使用的是类名而不是表名
		Query query = session.createQuery("from plantInfo where stationId=? ");
		query.setParameter(0,140243L);
		List<plantInfo> list = query.list();
		for (plantInfo r : list) {
			System.out.println(r);
		}
		tr.commit();
	}
	/***
	 * plantExpectdeN基本测试
	 */
	@Test
	public void run10() {
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		// 使用的是类名而不是表名
		Query query = session.createQuery("from plantHQN where typeId=? ");
		query.setParameter(0,140261L);
		List<plantHQN> list = query.list();
		for (plantHQN r : list) {
			System.out.println(r);
		}
		tr.commit();
	}
	/***
	 * plantExpectdeN基本测试
	 */
	@Test
	public void run9() {
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		// 使用的是类名而不是表名
		Query query = session.createQuery("from plantExpectedN where typeId=? ");
		query.setParameter(0,140261L);
		List<plantExpectedN> list = query.list();
		for (plantExpectedN r : list) {
			System.out.println(r);
		}
		tr.commit();
	}
	/***
	 * downStation基本测试
	 */
	@Test
	public void run8() {
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		// 使用的是类名而不是表名
		Query query = session.createQuery("from downStation where riverId=? ");
		query.setParameter(0,140222L);
		List<downStation> list = query.list();
		for (downStation r : list) {
			System.out.println(r);
		}
		tr.commit();
	}
	/***
	 *downrz基本测试
	 */
	@Test
	public void run7() {
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		// 使用的是类名而不是表名
		Query query = session.createQuery("from downRZ where stationId=?");
		query.setParameter(0,140242L);
		List<downRZ> list = query.list();
		for (downRZ r : list) {
			System.out.println(r);
		}
		tr.commit();
	}
	/***
	 * upStation基本测试
	 */
	@Test
	public void run6() {
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		// 使用的是类名而不是表名
		Query query = session.createQuery("from upStation where riverId=? ");
		query.setParameter(0,140222L);
		List<upStation> list = query.list();
		for (upStation r : list) {
			System.out.println(r);
		}
		tr.commit();
	}
	/***
	 * userType基本测试
	 */
	@Test
	public void run5() {
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		// 使用的是类名而不是表名
		Query query = session.createQuery("from userType ");
//		query.setParameter(0,140242L);
		List<userType> list = query.list();
		for (userType r : list) {
			System.out.println(r);
		}
		tr.commit();
	}
	/***
	 * userInfo基本测试
	 */
	@Test
	public void run4() {
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		// 使用的是类名而不是表名
		Query query = session.createQuery("from userInfo ");
//		query.setParameter(0,140242L);
		List<userInfo> list = query.list();
		for (userInfo r : list) {
			System.out.println(r);
		}
		tr.commit();
	}
	/***
	 * upzv基本测试
	 */
	@Test
	public void run3() {
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		// 使用的是类名而不是表名
		Query query = session.createQuery("from upZV where stationId=?");
		query.setParameter(0,140242L);
		List<upZV> list = query.list();
		for (upZV r : list) {
			System.out.println(r);
		}
		tr.commit();
	}
	/***
	 * stationInfo基本测试
	 */
	@Test
	public void run2() {
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		// 使用的是类名而不是表名
		Query query = session.createQuery("from stationInfo where riverId=?");
		query.setParameter(0,Long.valueOf("140225"));
		List<stationInfo> list = query.list();
		for (stationInfo r : list) {
			System.out.println(r);
		}
		tr.commit();
	}
	/***
	 * riverInfo基本测试
	 */
	@Test
	public void run1() {
		Session session = HibernateUtils.getSession();
		Transaction tr = session.beginTransaction();
		// 使用的是类名而不是表名
		Query query = session.createQuery("from riverInfo  order by riverid ");
		List<riverInfo> list = query.list();
		for (riverInfo r : list) {
			System.out.println(r);
		}
		tr.commit();
	}
}
