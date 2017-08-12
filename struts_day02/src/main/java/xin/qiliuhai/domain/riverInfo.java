package xin.qiliuhai.domain;

/***
 * 流域表，对应数据库中的riverinfo表
 * @author Admin
 *
 */
public class riverInfo {
	//流域ID
	private Long riverId;
	//流域名
	private String riverName;
	//流域控制区域，没有用到
	private Long controlArea;
	
	
	
	
	
	
	public Long getRiverId() {
		return riverId;
	}
	public void setRiverId(Long riverId) {
		this.riverId = riverId;
	}
	public String getRiverName() {
		return riverName;
	}
	public void setRiverName(String riverName) {
		this.riverName = riverName;
	}
	public Long getControlArea() {
		return controlArea;
	}
	@Override
	public String toString() {
		return "riverInfo [riverId=" + riverId + ", riverName=" + riverName
				+ ", controlArea=" + controlArea + "]";
	}
	public void setControlArea(Long controlArea) {
		this.controlArea = controlArea;
	}
	
}
