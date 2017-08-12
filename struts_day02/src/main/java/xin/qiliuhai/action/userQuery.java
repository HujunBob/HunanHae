package xin.qiliuhai.action;

import java.util.List;

import net.sf.json.JSONArray;
import xin.qiliuhai.domain.userInfo;
import xin.qiliuhai.service.userServiceImpl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class userQuery extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JSONArray json;

	public JSONArray getJson() {
		return json;
	}

	public void setJson(JSONArray json) {
		this.json = json;
	}
	/***
	 * 获得所有用户
	 * @return
	 */
	public String getAll(){
		List<userInfo> list=new userServiceImpl().getAll();
		ValueStack vs = ActionContext.getContext().getValueStack();
		System.out.println(list.get(0).getId());
		vs.set("userInfo", list);
		return SUCCESS;
	}
	
}
