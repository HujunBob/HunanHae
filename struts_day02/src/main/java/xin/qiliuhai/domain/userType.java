package xin.qiliuhai.domain;

public class userType {
	//主键id
	private  Long Id;
	//用户级别
	private String type;
	
	
	
	@Override
	public String toString() {
		return "userType [id=" + Id + ", type=" + type + "]";
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		this.Id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
