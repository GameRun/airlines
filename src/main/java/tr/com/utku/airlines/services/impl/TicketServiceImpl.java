package tr.com.utku.airlines.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.com.utku.airlines.model.Customer;
import tr.com.utku.airlines.model.Flight;
import tr.com.utku.airlines.model.Ticket;
import tr.com.utku.airlines.services.data.CustomerData;
import tr.com.utku.airlines.services.data.FlightData;
import tr.com.utku.airlines.services.TickerService;
import tr.com.utku.airlines.services.data.TicketData;
import tr.com.utku.airlines.services.exception.AirlinesBusinessException;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TickerService {

    private final FlightData flightData;
    private final CustomerData customerData;
    private final TicketData ticketData;

    @Override
    public Ticket buyTicket(Ticket ticket) {

        Flight flight = flightData.getFlight(ticket.getFlight().getFlightCode());

        if (flight == null) {
            throw new AirlinesBusinessException("1007");
        }
        if (flight.getFlightDate().isBefore(LocalDate.now())) {
            throw new AirlinesBusinessException("1008");
        }
        Customer customer = customerData.getCustomerByAccountNo(ticket.getCustomer().getAccountNo());
        if (customer == null) {
            throw new AirlinesBusinessException("1009");
        }
        return ticketData.buyTicket(ticket);
    }

}
