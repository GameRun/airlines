package tr.com.utku.airlines.controller.request;

import lombok.Data;
import tr.com.utku.airlines.controller.dto.CustomerDTO;
import tr.com.utku.airlines.controller.dto.FlightDTO;
import tr.com.utku.airlines.model.Ticket;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
public class TicketRequest {

    @NotEmpty(message = "Ticket buyDate is mandatory")
    @NotNull(message = "Ticket buyDate is mandatory")
    private LocalDateTime buyDate;
    @NotEmpty(message = "Flight info is mandatory")
    @NotNull(message = "Flight info is mandatory")
    private FlightDTO flight;
    @NotEmpty(message = "Customer info is mandatory")
    @NotNull(message = "Customer info mandatory")
    private CustomerDTO customer;


    public Ticket toModel() {
        return Ticket.builder()
                .buyDate(buyDate)
                .flight(flight.toModel())
                .customer(customer.toModel())
                .build();
    }
}
