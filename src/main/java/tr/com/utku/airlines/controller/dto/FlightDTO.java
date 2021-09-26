package tr.com.utku.airlines.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tr.com.utku.airlines.model.Airport;
import tr.com.utku.airlines.model.Flight;

import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class FlightDTO {

    private String id;
    private String flightCode;
    private LocalDate flightDate;
    private LocalTime flightTime;
    private Airport departure;
    private Airport destination;

    public static FlightDTO fromModel(Flight model) {
        return FlightDTO.builder()
                .departure(model.getDeparture())
                .flightDate(model.getFlightDate())
                .id(model.getId())
                .destination(model.getDestination())
                .flightTime(model.getFlightTime())
                .build();
    }

    public Flight toModel() {
        return Flight.builder()
                .departure(departure)
                .flightDate(flightDate)
                .flightTime(flightTime)
                .destination(destination)
                .flightCode(flightCode)
                .build();
    }

}
