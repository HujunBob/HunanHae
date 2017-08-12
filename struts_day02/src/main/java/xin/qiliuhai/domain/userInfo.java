package xin.qiliuhai.domain;

/***
 * 用户信息表
 * @author Admin
 *
 */
public class userInfo {
	//主键id
	private Long Id;
	//用户名
	private String userName;
	//密码
	private String passWord;
	//真实姓名
	private String realName;
	//用户级别，为userType的外键
	private Long userTypeId;
	//手机号码
	private Long phoneNum;
	//办公地点
	private String office;
	
	
	
	
	
	@Override
	public String toString() {
		return "userInfo [Id=" + Id + ", userName=" + userName + ", passWord="
				+ passWord + ", realName=" + realName + ", userTypeId="
				+ userTypeId + ", phoneNum=" + phoneNum + ", Office=" + office
				+ "]";
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public Long getUserTypeId() {
		return userTypeId;
	}
	public void setUserTypeId(Long userTypeId) {
		this.userTypeId = userTypeId;
	}
	public Long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(Long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	
	
	
}
