package in.mane.response;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ticket {

	private Integer ticketId;
	private String from;
	private String to;
	private String trainNum;
	private String ticketCost;
	private String ticketStatus;
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
	public String getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	public String getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(String ticketCost) {
		this.ticketCost = ticketCost;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", from=" + from + ", to=" + to + ", trainNum=" + trainNum
				+ ", ticketCost=" + ticketCost + ", ticketStatus=" + ticketStatus + "]";
	}
	
	
	
}
