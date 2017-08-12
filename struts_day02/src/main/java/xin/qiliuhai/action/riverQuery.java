package xin.qiliuhai.action;

import java.util.List;




import net.sf.json.JSONArray;
import xin.qiliuhai.domain.riverInfo;
import xin.qiliuhai.service.riverServiceImpl;

import com.opensymphony.xwork2.ActionSupport;

public class riverQuery extends ActionSupport{
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
	 * 查询所有流域，返回其json格式
	 * @return
	 */
	public String getAllJson(){
		List<riverInfo> riverInfoList=new riverServiceImpl().getAll();
		json=JSONArray.fromObject(riverInfoList);
		
		//ValueStack vs = ActionContext.getContext().getValueStack();
		return SUCCESS;
		
	}
}
