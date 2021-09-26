package tr.com.utku.airlines.services.data;

import tr.com.utku.airlines.model.FlightCriteria;
import tr.com.utku.airlines.model.Flight;

import java.util.List;

public interface FlightData {

    Flight createFlight(Flight model);

    Flight getFlight(String flightCode);

    List<Flight> findFlight(FlightCriteria criteria);
}
