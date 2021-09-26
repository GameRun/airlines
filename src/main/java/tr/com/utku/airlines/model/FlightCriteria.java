package tr.com.utku.airlines.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class FlightCriteria {

    private String flightCode;
    private LocalDate flightDate;
    private Airport departure;
    private Airport destination;

}
