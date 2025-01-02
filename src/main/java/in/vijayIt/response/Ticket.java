package in.vijayIt.response;

import lombok.Data;

@Data
  public class Ticket {
	
	private Integer ticketId;
	private String from;
	private String to;
	private String trainNum;
	private String tktCost;
	private String ticketStatus;
	

}
