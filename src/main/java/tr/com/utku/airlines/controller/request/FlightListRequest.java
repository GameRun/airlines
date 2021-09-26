package tr.com.utku.airlines.controller.request;

import lombok.Data;
import tr.com.utku.airlines.model.Airport;
import tr.com.utku.airlines.model.FlightCriteria;

import java.time.LocalDate;

@Data
public class FlightListRequest {

    private String flightCode;
    private LocalDate flightDate;
    private Airport departure;
    private Airport destination;


    public FlightCriteria toModel() {
        return FlightCriteria.builder()
                .flightCode(flightCode)
                .flightDate(flightDate)
                .destination(destination)
                .departure(departure)
                .build();
    }
}
