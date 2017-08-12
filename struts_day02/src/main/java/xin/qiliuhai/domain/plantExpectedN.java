package xin.qiliuhai.domain;
/***
 * 电机出力特性
 * @author Admin
 *
 */
public class plantExpectedN {
	//id值
	private Long Id;
	//水头
	private Double H;
	//最大出力
	private Double maxN;
	//最小出力
	private Double minN;
	//对应的电机id，为plantTypeInfo的外键
	private Long typeId;
	
	@Override
	public String toString() {
		return "plantExpectedN [Id=" + Id + ", H=" + H + ", maxN=" + maxN
				+ ", minN=" + minN + ", typeId=" + typeId + "]";
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Double getH() {
		return H;
	}
	public void setH(Double h) {
		H = h;
	}
	public Double getMaxN() {
		return maxN;
	}
	public void setMaxN(Double maxN) {
		this.maxN = maxN;
	}
	public Double getMinN() {
		return minN;
	}
	public void setMinN(Double minN) {
		this.minN = minN;
	}
	public Long getTypeId() {
		return typeId;
	}
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	
}
