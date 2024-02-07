package in.ashokit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Ticket {

    private int ticketNumber;

    private String name;

    private String email;

    private String doj;

    private String from;

    private String to;

    private String trainNum;

    private String status;

	public int getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Ticket(int ticketNumber, String name, String email, String doj, String from, String to, String trainNum,
			String status) {
		super();
		this.ticketNumber = ticketNumber;
		this.name = name;
		this.email = email;
		this.doj = doj;
		this.from = from;
		this.to = to;
		this.trainNum = trainNum;
		this.status = status;
	}

	public Ticket() {
		super();
	}

	@Override
	public String toString() {
		return "Ticket [ticketNumber=" + ticketNumber + ", name=" + name + ", email=" + email + ", doj=" + doj
				+ ", from=" + from + ", to=" + to + ", trainNum=" + trainNum + ", status=" + status + "]";
	}

}

