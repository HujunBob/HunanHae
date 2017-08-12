package xin.qiliuhai.domain;

/***
 * 水电站库容与水位之间的关系
 * @author Admin
 *
 */
public class upZV {
	//水电站水位
	private Double Z;
	//水电站库容
	private Double V;
	//水电站id，为stationInfo的外键
	private Long stationId;
	//id值
	private Long Id;
	
	
	
	
	@Override
	public String toString() {
		return "upzv [Z=" + Z + ", V=" + V + ", stationId=" + stationId
				+ ", Id=" + Id + "]";
	}
	public Double getZ() {
		return Z;
	}
	public void setZ(Double z) {
		Z = z;
	}
	public Double getV() {
		return V;
	}
	public void setV(Double v) {
		V = v;
	}
	public Long getStationId() {
		return stationId;
	}
	public void setStationId(Long stationId) {
		this.stationId = stationId;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		this.Id = id;
	}
}
