package in.mane.request;

public class Passenger {

	private String fname;
	private String name;
	private String from;
	private String to;
	private String doj;
	private String trainNum;
	//
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	@Override
	public String toString() {
		return "Passenger [fname=" + fname + ", name=" + name + ", from=" + from + ", to=" + to + ", doj=" + doj
				+ ", trainNum=" + trainNum + "]";
	}
	
	//
	
	
}
