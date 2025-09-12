package in.mane.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "USER_TASK_DTLS")
public class UserTaskEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer taskId;
	private String taskName;
	private LocalDate taskDate;
	private LocalTime taskTime;
	
	//
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserRegistrationEntity userReg;
	//
	
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public LocalDate getTaskDate() {
		return taskDate;
	}
	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}
	public LocalTime getTaskTime() {
		return taskTime;
	}
	public void setTaskTime(LocalTime taskTime) {
		this.taskTime = taskTime;
	}
	public UserRegistrationEntity getUserReg() {
		return userReg;
	}
	public void setUserReg(UserRegistrationEntity userReg) {
		this.userReg = userReg;
	}
	@Override
	public String toString() {
		return "UserTaskEntity [taskId=" + taskId + ", taskName=" + taskName + ", taskDate=" + taskDate + ", taskTime="
				+ taskTime + ", userReg=" + userReg + "]";
	}
	
	
	//
	
}
