package xin.qiliuhai.domain;
/***
 * 水电站下游电站关系
 * @author Admin
 *
 */
public class downStation {
	//id值
	private Long Id;
	//当前水电站id
	private Long stationId;
	//下游id值
	private Long downStationId;
	private Long distance;
	private Long deltat;
	//流域id
	private Long riverId;
	
	
	
	@Override
	public String toString() {
		return "downStation [Id=" + Id + ", stationId=" + stationId
				+ ", downStationId=" + downStationId + ", distance=" + distance
				+ ", deltat=" + deltat + ", riverId=" + riverId + "]";
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Long getStationId() {
		return stationId;
	}
	public void setStationId(Long stationId) {
		this.stationId = stationId;
	}
	public Long getDownStationId() {
		return downStationId;
	}
	public void setDownStationId(Long downStationId) {
		this.downStationId = downStationId;
	}
	public Long getDistance() {
		return distance;
	}
	public void setDistance(Long distance) {
		this.distance = distance;
	}
	public Long getDeltat() {
		return deltat;
	}
	public void setDeltat(Long deltat) {
		this.deltat = deltat;
	}
	public Long getRiverId() {
		return riverId;
	}
	public void setRiverId(Long riverId) {
		this.riverId = riverId;
	}
	
	
}
