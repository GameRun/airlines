package tr.com.utku.airlines.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Flight {

    private String id;
    private String flightCode;
    private LocalDate flightDate;
    private LocalTime flightTime;
    private Airport departure;
    private Airport destination;
}
