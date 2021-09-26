package tr.com.utku.airlines.repository.impl;

import org.springframework.stereotype.Service;
import tr.com.utku.airlines.model.Ticket;
import tr.com.utku.airlines.services.data.TicketData;

@Service
public class TicketDataImpl implements TicketData {
    @Override
    public Ticket buyTicket(Ticket ticket) {
        return null;
    }
}
