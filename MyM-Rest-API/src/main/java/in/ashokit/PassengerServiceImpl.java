package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class PassengerServiceImpl implements PassengerService {
	  private static final String IRCTC_URL = "http://localhost:8080/";

	    RestTemplate restTemplate = new RestTemplate();

	@Override
	public Ticket bookTicket(Passenger passenger) {
	  ResponseEntity<Ticket> response = restTemplate.postForEntity( IRCTC_URL + "ticket" , passenger , Ticket.class );

        return response.getBody();
	
	}

	@Override
	public List<Ticket> getAllTickets() {
        ResponseEntity<Ticket[]> response = restTemplate.getForEntity( IRCTC_URL + "allTickets" , Ticket[].class );

        return Arrays.asList(response.getBody());
	}

}
