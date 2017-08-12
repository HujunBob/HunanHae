package xin.qiliuhai.action;

import java.util.List;

import net.sf.json.JSONArray;
import xin.qiliuhai.domain.stationInfo;
import xin.qiliuhai.service.stationServiceImpl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class stationQuery extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String riverId;
	private JSONArray json;
	private String stationId;
	public String getStationId() {
		return stationId;
	}

	public void setStationId(String stationId) {
		this.stationId = stationId;
	}

	public JSONArray getJson() {
		return json;
	}

	public void setJson(JSONArray json) {
		this.json = json;
	}

	public String getRiverId() {
		return riverId;
	}

	public void setRiverId(String riverId) {
		this.riverId = riverId;
	}
	/***
	 * 获得前十个电站，每页有十个电站
	 * @return
	 */
	public String getAll() {
		List<stationInfo> list = new stationServiceImpl().getAll();
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.set("stationInfoList", list);
		return SUCCESS;
	}
	/***
	 * 获得下一页
	 * @return
	 */
	public String getNextPage(){
		List<stationInfo> list = new stationServiceImpl().getNextPage(stationId);
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.set("stationInfoList", list);
		return SUCCESS;
	}
	/***
	 * 获得上一页
	 * @return
	 */
	public String getLastPage(){
		List<stationInfo> list = new stationServiceImpl().getLastPage(stationId);
		ValueStack vs = ActionContext.getContext().getValueStack();
		vs.set("stationInfoList", list);
		return SUCCESS;
	}
	/***
	 * 获得所有的电站，返回其json格式
	 * @return
	 */
	public String getAllJson(){
		List<stationInfo> list = new stationServiceImpl().getAll(riverId);
		json = JSONArray.fromObject(list);
		return SUCCESS; 
	}
}
