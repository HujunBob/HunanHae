package xin.qiliuhai.domain;
/***
 * 电机信息表
 * @author Admin
 *
 */
public class plantInfo {
	//主键 id
	private Long plantId;
	//电机名
	private String plantName;
	//电机类型id，为plantTypeInfo的外键
	private Long typeId;
	//水电站id
	private Long stationId;
	
	
	@Override
	public String toString() {
		return "plantInfo [plantId=" + plantId + ", plantName=" + plantName
				+ ", typeId=" + typeId + ", stationId=" + stationId + "]";
	}
	public Long getPlantId() {
		return plantId;
	}
	public void setPlantId(Long plantId) {
		this.plantId = plantId;
	}
	public String getPlantName() {
		return plantName;
	}
	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}
	public Long getTypeId() {
		return typeId;
	}
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	public Long getStationId() {
		return stationId;
	}
	public void setStationId(Long stationId) {
		this.stationId = stationId;
	}
	
}
