package in.ashokit;


import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface PassengerService {

    Ticket bookTicket(Passenger passenger);

    List<Ticket> getAllTickets();

}
