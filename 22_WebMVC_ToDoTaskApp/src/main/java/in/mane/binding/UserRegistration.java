package in.mane.binding;

// Binding class
public class UserRegistration {

	private Integer userId;
	private String userName;
	private String userEmail;
	private String userGender;
	private Integer userPhno;
	private String userPwd;
	//
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public Integer getUserPhno() {
		return userPhno;
	}
	public void setUserPhno(Integer userPhno) {
		this.userPhno = userPhno;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	@Override
	public String toString() {
		return "UserRegistration [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail
				+ ", userGender=" + userGender + ", userPhno=" + userPhno + ", userPwd=" + userPwd + "]";
	}
	
	//
	
	
	
	
	
	
	
	
}
