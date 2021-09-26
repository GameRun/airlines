package tr.com.utku.airlines.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Ticket {

    private String id;
    private Customer customer;
    private LocalDateTime buyDate;
    private Flight flight;

}
