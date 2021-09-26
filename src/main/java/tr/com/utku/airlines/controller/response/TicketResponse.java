package tr.com.utku.airlines.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tr.com.utku.airlines.controller.dto.TicketDTO;
import tr.com.utku.airlines.model.Ticket;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TicketResponse {

    private TicketDTO ticket;


    public static TicketResponse fromModel(Ticket model) {
        return TicketResponse.builder()
                .ticket(TicketDTO.fromModel(model)).build();
    }


}
