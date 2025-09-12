package in.mane.binding;

import java.time.LocalDate;
import java.time.LocalTime;

public class UserTask {
	
	private Integer taskId;
	private String taskName;
	private LocalDate taskDate;
	private LocalTime taskTime;
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
	@Override
	public String toString() {
		return "UserTask [taskId=" + taskId + ", taskName=" + taskName + ", taskDate=" + taskDate + ", taskTime="
				+ taskTime + "]";
	}
	
	//
	
	
	
}
