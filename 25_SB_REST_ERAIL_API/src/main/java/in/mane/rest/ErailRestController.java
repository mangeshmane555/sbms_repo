package in.mane.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.mane.request.Passenger;
import in.mane.response.Ticket;

@RestController
public class ErailRestController {

	private Map<Integer, Ticket> tickets = new HashMap<>();

	@PostMapping(value = "/ticket", 
			consumes = { "application/xml", "application/json" }, 
			produces = { "application/xml", "application/json" }
	)
	public Ticket bookTicket(@RequestBody Passenger passenger) {

//		System.out.println(passenger);
		// Logic to book ticket
		Ticket t = new Ticket();

		
		int ticketId = 100;

		t.setTicketId(ticketId);
		t.setFrom(passenger.getFrom());
		t.setTo(passenger.getTo());
		t.setTicketStatus("CONFIRMED");
		t.setTrainNum(passenger.getTrainNum());
		t.setTicketCost("1400.00 INR");

		tickets.put(ticketId, t);
		
		ticketId ++;
		return t;
	}

	@GetMapping(value = "/ticket/{ticketId}", 
			produces = { "application/xml", "application/json" }
	)
	public Ticket getTicket(@PathVariable Integer ticketId) {

		// Get ticket from db
		if (tickets.containsKey(ticketId)) {

			return (tickets.get(ticketId));
		}
		return null;


	}
}
