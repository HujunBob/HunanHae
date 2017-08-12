package xin.qiliuhai.domain;
/***
 * 尾水特性表
 * @author Admin
 *
 */
public class downRZ {
	//id值，主键
	private Long Id;
	//下泄流量
	private Double R;
	//尾水水位
	private Double Z;
	//水电站id值
	private Long StationId;
	
	
	
	@Override
	public String toString() {
		return "downRZ [Id=" + Id + ", R=" + R + ", Z=" + Z + ", StationId="
				+ StationId + "]";
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Double getR() {
		return R;
	}
	public void setR(Double r) {
		R = r;
	}
	public Double getZ() {
		return Z;
	}
	public void setZ(Double z) {
		Z = z;
	}
	public Long getStationId() {
		return StationId;
	}
	public void setStationId(Long stationId) {
		StationId = stationId;
	}
	
	
}
