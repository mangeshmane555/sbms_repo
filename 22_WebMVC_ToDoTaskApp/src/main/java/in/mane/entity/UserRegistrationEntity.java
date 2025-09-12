package in.mane.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "USER_REGISTRATION_DTLS") 
public class UserRegistrationEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	private String userName;
	private String userEmail;
	private String userGender;
	private Integer userPhno;
	private String userPwd;
	//
	
	@OneToMany(mappedBy = "userReg",  cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<UserTaskEntity> userTask;
	
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
	public List<UserTaskEntity> getUserTask() {
		return userTask;
	}
	public void setUserTask(List<UserTaskEntity> userTask) {
		this.userTask = userTask;
	}
	//
	
	@Override
	public String toString() {
		return "UserRegistrationEntity [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail
				+ ", userGender=" + userGender + ", userPhno=" + userPhno + ", userPwd=" + userPwd + ", userTask="
				+ userTask + "]";
	}
	
	
	
}
