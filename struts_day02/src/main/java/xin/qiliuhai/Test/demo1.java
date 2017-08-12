package xin.qiliuhai.Test;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;


public class demo1 extends ActionSupport{

	public class User{
		private String username;
		private String password;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public User(String username,String password){
			this.username=username;
			this.password=password;
		}
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String showAll(){
		ValueStack vs = ActionContext.getContext().getValueStack();
		List<User> userList=new ArrayList<>();
		userList.add(new User("小美","1233"));
		userList.add(new User("小明","1233"));
		userList.add(new User("小智","1233"));
		vs.set("user", userList);
		return SUCCESS;
	}
	public String save(){
		ValueStack vs = ActionContext.getContext().getValueStack();
		HttpServletRequest request = ServletActionContext.getRequest();
		User user=new User("小美", "12334");
//		vs.push("123");
//		vs.set("msg","456");
//	//	vs.find
	//	vs.set("user",user);
		request.setAttribute("user",user);
		request.getSession().setAttribute("user2", user);
		
	//	request.getParameterMap().put("user3", user);
		return SUCCESS;
	}
	}
