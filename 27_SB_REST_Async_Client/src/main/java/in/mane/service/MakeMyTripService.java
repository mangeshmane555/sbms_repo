package in.mane.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class MakeMyTripService {

	@Value("${irctc.endpoint.bookticket}")
	private String IRCTC_BOOK_TICKET_URL;

	@Value("${irctc.endpoint.getticket}")
	private String IRCTC_GET_TICKET_URL;

	public void getTicketInfo(String ticketId) {
		
		System.out.println("Sync method started******");
		
		WebClient webClient = WebClient.create();
		String response = webClient.get()
		.uri(IRCTC_GET_TICKET_URL, ticketId)
		.accept(MediaType.APPLICATION_JSON)
		.retrieve()
		.bodyToMono(String.class)
		.block();
		
		System.out.println(response);
		
		
		System.out.println("sync method Ended******");
	}
	
	public void getTicketAsync(String ticketId) {
		
		System.out.println("Async method started******");
		WebClient webClient = WebClient.create();
		
		webClient.get()
			.uri(IRCTC_GET_TICKET_URL, ticketId)
			.accept(MediaType.APPLICATION_JSON)
			.retrieve()
			.bodyToMono(String.class)
			.subscribe(response->handleResponse(response)); // Doesn't wait for the response
			
		System.out.println("Async method Ended******");
	}
	
	public void handleResponse(String response) {
		System.out.println(response);
		
	}
	
	
}
