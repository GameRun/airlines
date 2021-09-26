package tr.com.utku.airlines.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tr.com.utku.airlines.model.Ticket;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TicketDTO {

    private String id;
    private LocalDateTime buyDate;
    private FlightDTO flight;
    private CustomerDTO customer;


    public static TicketDTO fromModel(Ticket ticket) {
        return TicketDTO.builder()
                .id(ticket.getId())
                .buyDate(ticket.getBuyDate())
                .flight(FlightDTO.fromModel(ticket.getFlight()))
                .customer(CustomerDTO.fromModel(ticket.getCustomer()))
                .build();
    }

}
