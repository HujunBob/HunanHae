package xin.qiliuhai.domain;
/***
 * 上游电站关系
 * @author Admin
 *
 */
public class upStation {
	//主键id
	private Long Id;
	//当前电站id
	private Long stationId;
	//上游电站id
	private Long upStationId;
	//流域id
	private Long riverId;
	
	@Override
	public String toString() {
		return "upStation [stationId=" + stationId + ", upStationId="
				+ upStationId + ", riverId=" + riverId + ", Id=" + Id + "]";
	}
	
	
	public Long getStationId() {
		return stationId;
	}
	public void setStationId(Long stationId) {
		this.stationId = stationId;
	}
	public Long getUpStationId() {
		return upStationId;
	}
	public void setUpStationId(Long upStationId) {
		this.upStationId = upStationId;
	}
	public Long getRiverId() {
		return riverId;
	}
	public void setRiverId(Long riverId) {
		this.riverId = riverId;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	
}
