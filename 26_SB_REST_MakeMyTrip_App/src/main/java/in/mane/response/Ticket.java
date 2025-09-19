package in.mane.response;

import lombok.Data;

// Binding class for Ticket class
@Data
public class Ticket {
	
	private Integer ticketId;
	private String from;
	private String to;
	private String ticketStatus;
	private String ticketCost;
	private String trainNum;
	//
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
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
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(String ticketCost) {
		this.ticketCost = ticketCost;
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
		return "Ticket [ticketId=" + ticketId + ", from=" + from + ", to=" + to + ", ticketStatus=" + ticketStatus
				+ ", ticketCost=" + ticketCost + ", trainNum=" + trainNum + "]";
	}
	
	
	
}
