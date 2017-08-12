package xin.qiliuhai.action;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import xin.qiliuhai.Utils.HibernateUtils;
import xin.qiliuhai.domain.userInfo;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class TestAction extends  ActionSupport implements ModelDriven<userInfo> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private userInfo user=new userInfo();
	
	
	public String test(){
		System.out.println(user);
		Session session = HibernateUtils.getCurrentSession();
		Transaction tr = session.beginTransaction();
		// 使用的是类名而不是表名
		session.saveOrUpdate(user);;
		tr.commit();
		return NONE;
	}

	@Override
	public userInfo getModel() {
		return user;
	}
	
}
