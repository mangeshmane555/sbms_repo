package in.mane.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import ch.qos.logback.core.util.ContentTypeUtil;
import in.mane.request.Passenger;
import in.mane.response.Ticket;

/*// Service class using RestTemplate
@Service
public class MakeMyTripService {
	
	@Value("${irctc.endpoint.bookticket}")
	private String IRCTC_BOOK_TICKET_URL;
	
	@Value("${irctc.endpoint.getticket}")
	private String IRCTC_GET_TICKET_URL;
	
	public Ticket getTicketInfo(String ticketId) {
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<Ticket> responseEntity = rt.getForEntity(IRCTC_GET_TICKET_URL, Ticket.class, ticketId);
		int statusCodeValue = responseEntity.getStatusCodeValue();
		
		if (statusCodeValue == 200) {
			
			Ticket ticket = responseEntity.getBody();
			return ticket;
		}else {
			return null;
		}
		
	}
	
	public Ticket processTicketBooking(Passenger passenger_request) {
		
		// Access irctc api here using RestTemplate
		RestTemplate rt = new RestTemplate();
		rt.postForEntity(IRCTC_BOOK_TICKET_URL, passenger_request, Ticket.class);
		ResponseEntity<Ticket> responseEntity = rt.postForEntity(IRCTC_BOOK_TICKET_URL, passenger_request, Ticket.class);
		
		int statusCode = responseEntity.getStatusCodeValue();
		
		if (statusCode == 200) {
			Ticket ticket = responseEntity.getBody();
			return ticket;
		}
		else {
			return null;
		}
		
	}
}
*/

// Service class RestClient Development using WebClient (Interface)
@Service
public class MakeMyTripService {

	@Value("${irctc.endpoint.bookticket}")
	private String IRCTC_BOOK_TICKET_URL;

	@Value("${irctc.endpoint.getticket}")
	private String IRCTC_GET_TICKET_URL;

	public Ticket getTicketInfo(String ticketId) {

		WebClient webClient = WebClient.create();
		Ticket ticket = webClient.get()
				.uri(IRCTC_GET_TICKET_URL, ticketId) // Endpoint Url
				.accept(MediaType.APPLICATION_JSON)
				.retrieve() // Take response from response body
				.bodyToMono(Ticket.class) // Bind response body data to java object
				.block(); // For Synchronous call

		if (ticket != null) {
			return ticket;
		}
		return null;
	}

	public Ticket processTicketBooking(Passenger passenger_request) {

		// Access irctc api here using RestTemplate	
		WebClient webClient = WebClient.create();
		Ticket ticket = webClient.post()
				.uri(IRCTC_BOOK_TICKET_URL, passenger_request)
				.body(BodyInserters.fromValue(passenger_request))
				.header("content-type", "application/json")
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.bodyToMono(Ticket.class)
				.block();
				
		if (ticket != null) {
			return ticket;
		}		
		return null;
			
	}

}
