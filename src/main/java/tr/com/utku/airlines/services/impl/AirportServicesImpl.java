package tr.com.utku.airlines.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.com.utku.airlines.model.Airport;
import tr.com.utku.airlines.model.AirportCriteria;
import tr.com.utku.airlines.services.data.AirportData;
import tr.com.utku.airlines.services.AirportServices;
import tr.com.utku.airlines.services.exception.AirlinesBusinessException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AirportServicesImpl implements AirportServices {

    private final AirportData airportData;

    @Override
    public Airport createAirport(Airport airport) {

        Airport existAirport = airportData.getAirportByCode(airport.getCode());
        if (existAirport == null) {
            return airportData.createAirport(airport);
        } else {
            throw new AirlinesBusinessException("A001");
        }
    }

    @Override
    public List<Airport> listAirport(AirportCriteria criteria) {
        return airportData.listAirports(criteria);
    }

}
