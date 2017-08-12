package xin.qiliuhai.domain;
/***
 * 电机的HQN特性
 * @author Admin
 *
 */
public class plantHQN {
	
	private  Double H;
	private Double Q;
	private Double N;
	private Long typeId;
	private Long Id;
	
	
	@Override
	public String toString() {
		return "plantHQN [H=" + H + ", Q=" + Q + ", N=" + N + ", TypeId="
				+ typeId + ", Id=" + Id + "]";
	}
	public Double getH() {
		return H;
	}
	public void setH(Double h) {
		H = h;
	}
	public Double getQ() {
		return Q;
	}
	public void setQ(Double q) {
		Q = q;
	}
	public Double getN() {
		return N;
	}
	public void setN(Double n) {
		N = n;
	}
	public Long getTypeId() {
		return typeId;
	}
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	
}
