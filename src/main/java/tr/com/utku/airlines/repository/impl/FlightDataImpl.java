package tr.com.utku.airlines.repository.impl;

import org.springframework.stereotype.Service;
import tr.com.utku.airlines.model.Flight;
import tr.com.utku.airlines.model.FlightCriteria;
import tr.com.utku.airlines.services.data.FlightData;

import java.util.List;

@Service
public class FlightDataImpl implements FlightData {
    @Override
    public Flight createFlight(Flight model) {
        return null;
    }

    @Override
    public Flight getFlight(String flightCode) {
        return null;
    }

    @Override
    public List<Flight> findFlight(FlightCriteria criteria) {
        return null;
    }
}
