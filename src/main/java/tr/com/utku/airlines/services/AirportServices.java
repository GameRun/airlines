package tr.com.utku.airlines.services;

import tr.com.utku.airlines.model.Airport;
import tr.com.utku.airlines.model.AirportCriteria;

import java.util.List;

public interface AirportServices {
    Airport createAirport(Airport airport);

    List<Airport> listAirport(AirportCriteria criteria);
}
