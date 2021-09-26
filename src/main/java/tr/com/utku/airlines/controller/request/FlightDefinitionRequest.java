package tr.com.utku.airlines.controller.request;

import lombok.Data;
import tr.com.utku.airlines.model.Airport;
import tr.com.utku.airlines.model.Flight;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class FlightDefinitionRequest {

    private String flightCode;
    private LocalDate flightDate;
    private LocalTime flightTime;
    private Airport departure;
    private Airport destination;


    public Flight toModel() {
        return Flight.builder()
                .flightDate(flightDate)
                .flightCode(flightCode)
                .departure(departure)
                .flightTime(flightTime)
                .destination(destination)
                .build();
    }

}
