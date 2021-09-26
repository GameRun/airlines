package tr.com.utku.airlines.services.data;

import tr.com.utku.airlines.model.Airport;
import tr.com.utku.airlines.model.AirportCriteria;

import java.util.List;

public interface AirportData {

    Airport createAirport(Airport airport);

    Airport getAirportByCode(String code);

    List<Airport> listAirports(AirportCriteria criteria);

}
