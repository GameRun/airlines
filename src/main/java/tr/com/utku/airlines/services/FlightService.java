package tr.com.utku.airlines.services;

import tr.com.utku.airlines.model.FlightCriteria;
import tr.com.utku.airlines.model.Flight;

import java.util.List;

public interface FlightService {
    Flight createFlight(Flight model);

    List<Flight> findFlight(FlightCriteria criteria);
}
