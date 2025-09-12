package in.mane.binding;

public class UserLogin {
	
	private Integer userId;
	private String userEmail;
	private String userPwd;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	@Override
	public String toString() {
		return "UserLogin [userId=" + userId + ", userEmail=" + userEmail + ", userPwd=" + userPwd + "]";
	}
	
	//
	
	
	
	
}
