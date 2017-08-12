package xin.qiliuhai.action;

import java.util.List;

import net.sf.json.JSONArray;
import xin.qiliuhai.domain.userInfo;
import xin.qiliuhai.service.userInfoServiceImpl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.ValueStack;

public class userInfoQuery extends ActionSupport implements ModelDriven<userInfo>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JSONArray json;
	private userInfo userInfo=new userInfo();
	public JSONArray getJson() {
		return json;
	}

	public void setJson(JSONArray json) {
		this.json = json;
	}
	
	public String delete(){
		new userInfoServiceImpl().delete(userInfo);
		return NONE;
	}
	public String edit(){
		new userInfoServiceImpl().save(userInfo);
		return NONE;
	}
	/***
	 * 获得所有用户
	 * @return
	 */
	public String getAll(){
		List<userInfo> list=new userInfoServiceImpl().getAll();
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.set("userInfo", list);
		return SUCCESS;
	}

	@Override
	public userInfo getModel() {
		return userInfo;
	}
	
}
