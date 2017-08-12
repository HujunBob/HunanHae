package xin.qiliuhai.domain;

/***
 * 水电站基本信息
 * @author Admin
 *
 */
public class stationInfo {
	//水电站id值 ，主键
	private Long  stationId;
	//水电站名
	private String stationName;
	//调节类型
	private Long adjustType;
	//正常水位 单位m
	private Double normalZ;
	//死水位	单位m
	private Double deadZ;
	//流域名，riverInfo的外键
	private Long riverId;
	//水电站最大下泄流量
	private Double plantsMaxQ;
	//水电站最大发电流量
	private Double stationMaxR;
	//水电站最小发电流量
	private Double stationMinR;
	//水电站机组类型数
	private Long plantsTypeNum;
	//水电站机组数量
	private Long plantsNum;
	//水电站最大出力
	private Double ratedN;
	//水电站保证出力
	private Double guaranteedN;
	//K值
	private Double KValue;
	//限制洪水位
	private Double floodLimitZ;
	//最大洪水位
	private Double floodMaxZ;
	//设计洪水位
	private Double designFloodZ;
	//校核洪水位
	private Double checkFloodZ;
	//死水库容
	private Double deadV;
	//调节库容
	private Double activeV;
	//是否使用
	private Long inUse;
	//相对地理坐标
	private Double relativeX;
	private Double relativeY;
	//总库容
	private Double totalV;
	//是否参与短期调度
	private Long shortCanUse;
	//是否参与长期调度
	private Long LongCanUse;
	//是否参与中期调度
	private Long middleCanUse;
	//是否为可调水库
	private Long fittingCanUse;
	//南瑞集团的水电站ID
	private Long nariStationId;

	@Override
	public String toString() {
		return "stationInfo [stationId=" + stationId + ", stationName="
				+ stationName + ", adjustType=" + adjustType + ", normalZ="
				+ normalZ + ", deadZ=" + deadZ + ", riverId=" + riverId
				+ ", plantsMaxQ=" + plantsMaxQ + ", stationMaxR=" + stationMaxR
				+ ", stationMinR=" + stationMinR + ", plantsTypeNum="
				+ plantsTypeNum + ", plantsNum=" + plantsNum + ", ratedN="
				+ ratedN + ", guaranteedN=" + guaranteedN + ", KValue="
				+ KValue + ", floodLimitZ=" + floodLimitZ + ", floodMaxZ="
				+ floodMaxZ + ", designFloodZ=" + designFloodZ
				+ ", checkFloodZ=" + checkFloodZ + ", deadV=" + deadV
				+ ", activeV=" + activeV + ", inUse=" + inUse + ", relativeX="
				+ relativeX + ", relativeY=" + relativeY + ", totalV=" + totalV
				+ ", shortCanUse=" + shortCanUse + ", LongCanUse=" + LongCanUse
				+ ", middleCanUse=" + middleCanUse + ", fittingCanUse="
				+ fittingCanUse + ", nariStationId=" + nariStationId + "]";
	}
	public Long getStationId() {
		return stationId;
	}
	public void setStationId(Long stationId) {
		this.stationId = stationId;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public Long getAdjustType() {
		return adjustType;
	}
	public void setAdjustType(Long adjustType) {
		this.adjustType = adjustType;
	}
	public Double getNormalZ() {
		return normalZ;
	}
	public void setNormalZ(Double normalZ) {
		this.normalZ = normalZ;
	}
	public Double getDeadZ() {
		return deadZ;
	}
	public void setDeadZ(Double deadZ) {
		this.deadZ = deadZ;
	}
	public Long getRiverId() {
		return riverId;
	}
	public void setRiverId(Long riverId) {
		this.riverId = riverId;
	}
	public Double getPlantsMaxQ() {
		return plantsMaxQ;
	}
	public void setPlantsMaxQ(Double plantsMaxQ) {
		this.plantsMaxQ = plantsMaxQ;
	}
	public Double getStationMaxR() {
		return stationMaxR;
	}
	public void setStationMaxR(Double stationMaxR) {
		this.stationMaxR = stationMaxR;
	}
	public Double getStationMinR() {
		return stationMinR;
	}
	public void setStationMinR(Double stationMinR) {
		this.stationMinR = stationMinR;
	}
	public Long getPlantsTypeNum() {
		return plantsTypeNum;
	}
	public void setPlantsTypeNum(Long plantsTypeNum) {
		this.plantsTypeNum = plantsTypeNum;
	}
	public Long getPlantsNum() {
		return plantsNum;
	}
	public void setPlantsNum(Long plantsNum) {
		this.plantsNum = plantsNum;
	}
	public Double getRatedN() {
		return ratedN;
	}
	public void setRatedN(Double ratedN) {
		this.ratedN = ratedN;
	}
	public Double getGuaranteedN() {
		return guaranteedN;
	}
	public void setGuaranteedN(Double guaranteedN) {
		this.guaranteedN = guaranteedN;
	}
	public Double getKValue() {
		return KValue;
	}
	public void setKValue(Double kValue) {
		KValue = kValue;
	}
	public Double getFloodLimitZ() {
		return floodLimitZ;
	}
	public void setFloodLimitZ(Double floodLimitZ) {
		this.floodLimitZ = floodLimitZ;
	}
	public Double getFloodMaxZ() {
		return floodMaxZ;
	}
	public void setFloodMaxZ(Double floodMaxZ) {
		this.floodMaxZ = floodMaxZ;
	}
	public Double getDesignFloodZ() {
		return designFloodZ;
	}
	public void setDesignFloodZ(Double designFloodZ) {
		this.designFloodZ = designFloodZ;
	}
	public Double getCheckFloodZ() {
		return checkFloodZ;
	}
	public void setCheckFloodZ(Double checkFloodZ) {
		this.checkFloodZ = checkFloodZ;
	}
	public Double getDeadV() {
		return deadV;
	}
	public void setDeadV(Double deadV) {
		this.deadV = deadV;
	}
	public Double getActiveV() {
		return activeV;
	}
	public void setActiveV(Double activeV) {
		this.activeV = activeV;
	}
	public Long getInUse() {
		return inUse;
	}
	public void setInUse(Long inUse) {
		this.inUse = inUse;
	}
	public Double getRelativeX() {
		return relativeX;
	}
	public void setRelativeX(Double relativeX) {
		this.relativeX = relativeX;
	}
	public Double getRelativeY() {
		return relativeY;
	}
	public void setRelativeY(Double relativeY) {
		this.relativeY = relativeY;
	}
	public Double getTotalV() {
		return totalV;
	}
	public void setTotalV(Double totalV) {
		this.totalV = totalV;
	}
	public Long getShortCanUse() {
		return shortCanUse;
	}
	public void setShortCanUse(Long shortCanUse) {
		this.shortCanUse = shortCanUse;
	}
	public Long getLongCanUse() {
		return LongCanUse;
	}
	public void setLongCanUse(Long longCanUse) {
		LongCanUse = longCanUse;
	}
	public Long getMiddleCanUse() {
		return middleCanUse;
	}
	public void setMiddleCanUse(Long middleCanUse) {
		this.middleCanUse = middleCanUse;
	}
	public Long getFittingCanUse() {
		return fittingCanUse;
	}
	public void setFittingCanUse(Long fittingCanUse) {
		this.fittingCanUse = fittingCanUse;
	}
	public Long getNariStationId() {
		return nariStationId;
	}
	public void setNariStationId(Long nariStationId) {
		this.nariStationId = nariStationId;
	}
	
}
