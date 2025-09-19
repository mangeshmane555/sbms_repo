package in.mane.request;

import lombok.Data;

// Binding class for Passenger class
@Data
public class Passenger {
	
	private String fname;
	private String lname;
	private String doj;
	private String from;
	private String to;
	private String trainNum;
	//
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	//
	
	@Override
	public String toString() {
		return "Passenger [fname=" + fname + ", lname=" + lname + ", doj=" + doj + ", from=" + from + ", to=" + to
				+ ", trainNum=" + trainNum + "]";
	}
	

}
